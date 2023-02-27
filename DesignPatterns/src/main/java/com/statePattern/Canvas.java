package com.statePattern;

public class Canvas {
    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }

    private Tool currentTool;

    public void mouseDown(){
        currentTool.mouseDown();
//        if (currentToolType == ToolType.FILL)
//            System.out.println("Fill icon");
//        else if  (currentToolType == ToolType.DRAW)
//            System.out.println("pen icon");
//        else if (currentToolType == ToolType.SELECTION)
//            System.out.println("select icon");
    }
    public void mouseUp(){
        currentTool.mouseUp();
//        if (currentToolType == ToolType.FILL)
//            System.out.println("Fill the page");
//        else if  (currentToolType == ToolType.DRAW)
//            System.out.println("draw a line");
//        else if (currentToolType == ToolType.SELECTION)
//            System.out.println("select area");
    }
}
