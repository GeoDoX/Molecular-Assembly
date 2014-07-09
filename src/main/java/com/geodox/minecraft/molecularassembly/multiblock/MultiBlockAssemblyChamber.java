package com.geodox.minecraft.molecularassembly.multiblock;

import com.geodox.minecraft.molecularassembly.block.ModBlocks;
import com.geodox.minecraft.molecularassembly.utility.DimensionalPattern;
import com.geodox.minecraft.molecularassembly.utility.LogHelper;
import net.minecraft.tileentity.TileEntity;

public class MultiBlockAssemblyChamber extends TileEntity
{
    // TODO: Comment Class

    private DimensionalPattern dPattern;

    private final DimensionalPattern.Row wallRow = DimensionalPattern.createRow("#####");
    private final DimensionalPattern.Row wallWithGlassRow = DimensionalPattern.createRow("#@@@#");
    private final DimensionalPattern.Row wallWithSpaceRow = DimensionalPattern.createRow("#   #");

    public MultiBlockAssemblyChamber()
    {
        createMultiBlock();
    }

    public void isFormed()
    {
        if(dPattern.hasFormed(worldObj, xCoord, yCoord, zCoord))
        {
            LogHelper.info("Assembly Chamber has Formed!");
        }
    }

    private void createMultiBlock()
    {
        DimensionalPattern.BlockState wall = new DimensionalPattern.BlockState('#', ModBlocks.assemblyChamberWall, 0);
        DimensionalPattern.BlockState glass = new DimensionalPattern.BlockState('@', ModBlocks.assemblyChamberWindow, 0);
        //DimensionalPattern.BlockState table = new DimensionalPattern.BlockState('T', ModBlocks.assemblyChamberTable, 0);
        DimensionalPattern.BlockState separator = new DimensionalPattern.BlockState('I', ModBlocks.assemblyChamberParticleSeparator, 0);
        DimensionalPattern.BlockState manipulator = new DimensionalPattern.BlockState('M', ModBlocks.assemblyChamberParticleManipulator, 0);

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
        DimensionalPattern.Row thirdLayerRow = DimensionalPattern.createRow("##!##");
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

}
