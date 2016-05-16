/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conklin_4_arraygame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jconklin2391
 */
public class ArrayGame {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    
    public static void printEmptyLines(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("");
        }
    }
    public void movePlayer(Grid grid, Player player, char[] direction) {
        player.setPositionXPrevious(player.getPositionX());
        player.setPositionYPrevious(player.getPositionY());
        for (int i = 0; i < direction.length; i++) {
            switch (direction[i]) {
                case 'N':
                    if (!((player.getPositionY() - 1) < 0)) {
                        player.setPositionY(player.getPositionY() - 1);
                    }

                    break;
                case 'S':
                    if (!((player.getPositionY() + 1) > grid.getHeight() - 1)) {
                        player.setPositionY(player.getPositionY() + 1);
                    }
                    break;
                case 'E':
                    if (!((player.getPositionX() + 1) > grid.getWidth() - 1)) {
                        player.setPositionX(player.getPositionX() + 1);
                    }
                    break;
                case 'W':
                    if (!((player.getPositionX() - 1) < 0)) {
                        player.setPositionX(player.getPositionX() - 1);
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
