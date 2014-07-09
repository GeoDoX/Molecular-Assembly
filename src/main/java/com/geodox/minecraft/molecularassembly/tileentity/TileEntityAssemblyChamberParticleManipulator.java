package com.geodox.minecraft.molecularassembly.tileentity;

import com.geodox.minecraft.molecularassembly.block.ModBlocks;
import com.geodox.minecraft.molecularassembly.utility.DimensionalPattern;
import com.geodox.minecraft.molecularassembly.utility.LogHelper;
import net.minecraft.tileentity.TileEntity;

public class TileEntityAssemblyChamberParticleManipulator extends TileEntity
{

    // TODO: Comment Class

    private DimensionalPattern dPattern;

    private final DimensionalPattern.Row wallRow = DimensionalPattern.createRow("#####");
    private final DimensionalPattern.Row wallWithGlassRow = DimensionalPattern.createRow("#@@@#");
    private final DimensionalPattern.Row wallWithSpaceRow = DimensionalPattern.createRow("#   #");

    public TileEntityAssemblyChamberParticleManipulator()
    {
        createMultiBlock();
    }

    public void isFormed()
    {
        LogHelper.info("isFormed");
        if(dPattern.hasFormed(worldObj, xCoord - 2, yCoord, zCoord - 2))
        {
            LogHelper.info("Assembly Chamber has Formed!");
        }
        else
        {
            LogHelper.info("Converted!");
            dPattern.convert(worldObj, xCoord - 2, yCoord, zCoord - 2, DimensionalPattern.Flag.IGNORE);
        }
    }

    private void createMultiBlock()
    {
        DimensionalPattern.BlockState wall = DimensionalPattern.createBlockState('#', ModBlocks.assemblyChamberWall);
        DimensionalPattern.BlockState glass = DimensionalPattern.createBlockState('@', ModBlocks.assemblyChamberWindow);
        //DimensionalPattern.BlockState table = DimensionalPattern.createBlockState('T', ModBlocks.assemblyChamberTable);
        DimensionalPattern.BlockState separator = DimensionalPattern.createBlockState('I', ModBlocks.assemblyChamberParticleSeparator);
        DimensionalPattern.BlockState manipulator = DimensionalPattern.createBlockState('M', ModBlocks.assemblyChamberParticleManipulator);

        dPattern = DimensionalPattern.createPattern("assemblyChamber", createFirstLayer(), createSecondLayer(), createThirdLayer(), createFourthLayer(), createFifthLayer(), wall, glass, separator, manipulator);
    }

    private DimensionalPattern.Layer createFirstLayer()
    {
        DimensionalPattern.Row manipulatorRow = DimensionalPattern.createRow("##M##");

        DimensionalPattern.Layer firstLayer = DimensionalPattern.createLayer(wallRow, wallRow, manipulatorRow, wallRow, wallRow);

        return firstLayer;
    }

    private DimensionalPattern.Layer createSecondLayer()
    {
        DimensionalPattern.Row secondLayerRow = wallRow;
        DimensionalPattern.Row secondLayerRow2 = wallWithSpaceRow;
        DimensionalPattern.Row secondLayerRow3 = DimensionalPattern.createRow("#   #"); // TODO: Replace with Table
        DimensionalPattern.Row secondLayerRow4 = wallWithSpaceRow;
        DimensionalPattern.Row secondLayerRow5 = wallWithGlassRow;

        DimensionalPattern.Layer secondLayer = DimensionalPattern.createLayer(secondLayerRow, secondLayerRow2, secondLayerRow3, secondLayerRow4, secondLayerRow5);

        return secondLayer;
    }

    private DimensionalPattern.Layer createThirdLayer()
    {
        DimensionalPattern.Row thirdLayerRow = DimensionalPattern.createRow("#####");
        DimensionalPattern.Row thirdLayerRow2 = wallWithSpaceRow;
        DimensionalPattern.Row thirdLayerRow3 = DimensionalPattern.createRow("I   #");
        DimensionalPattern.Row thirdLayerRow4 = wallWithSpaceRow;
        DimensionalPattern.Row thirdLayerRow5 = wallWithGlassRow;

        DimensionalPattern.Layer thirdLayer = DimensionalPattern.createLayer(thirdLayerRow, thirdLayerRow2, thirdLayerRow3, thirdLayerRow4, thirdLayerRow5);

        return thirdLayer;
    }

    private DimensionalPattern.Layer createFourthLayer()
    {
        DimensionalPattern.Row fourthLayerRow = wallRow;
        DimensionalPattern.Row fourthLayerRow2 = wallWithSpaceRow;
        DimensionalPattern.Row fourthLayerRow3 = wallWithSpaceRow;
        DimensionalPattern.Row fourthLayerRow4 = wallWithSpaceRow;
        DimensionalPattern.Row fourthLayerRow5 = wallWithGlassRow;

        DimensionalPattern.Layer fourthLayer = DimensionalPattern.createLayer(fourthLayerRow, fourthLayerRow2, fourthLayerRow3, fourthLayerRow4, fourthLayerRow5);

        return fourthLayer;
    }

    private DimensionalPattern.Layer createFifthLayer()
    {
        DimensionalPattern.Layer fifthLayer = DimensionalPattern.createLayer(wallRow, wallRow, wallRow, wallRow, wallRow);

        return fifthLayer;
    }

    @Override
    public boolean canUpdate()
    {
        return false;
    }

}
