package com.XiangQi.XiangQiBE.Common;

// This class is for parsing form move string sent by the client
// for moves generated by server is Move class instead
public class PieceMove {
  public int oldX;
  public int oldY;
  public char piece;
  public int newX;
  public int newY;

  public static PieceMove Parse(String moveStr) {
    var result = new PieceMove();

    result.oldX = Integer.parseInt("" + moveStr.charAt(0));
    result.oldY = Integer.parseInt("" + moveStr.charAt(1));
    result.piece = moveStr.charAt(2);
    result.newX = Integer.parseInt("" + moveStr.charAt(3));
    result.newY = Integer.parseInt("" + moveStr.charAt(4));

    return result;
  }

  public boolean isRed() {
    return Character.isUpperCase(piece);
  }
}