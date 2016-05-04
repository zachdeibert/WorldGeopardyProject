/*
 * Copyright (c) 2015, Zach Deibert
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package deibert.zach.school.worldgeopardy;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GeopardyBoard {
    protected final boolean tilesEnabled[][];
    protected Team teams[] = new Team[] {
        new Team(0),
        new Team(1),
        new Team(2)
    };
    protected int doublei;
    protected int turn;
    
    protected Category findCategory(String name) {
        for ( Category cat : QuestionModel.categories ) {
            if ( cat.name.equals(name) ) {
                return cat;
            }
        }
        return null;
    }
    
    protected int getCategoryIndex(Category cat) {
        for ( int i = 0; i < QuestionModel.categories.length; i++ ) {
            if ( QuestionModel.categories[i].equals(cat) ) {
                return i;
            }
        }
        return -1;
    }
    
    protected boolean allQuestionsAnswered() {
        for ( boolean a[] : tilesEnabled ) {
            for ( boolean b : a ) {
                if ( b ) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public void display() {
        Scanner scan = new Scanner(System.in);
        while ( true ) {
            if ( allQuestionsAnswered() ) {
                break;
            }
            Formatter.setStyle(Formatter.CLEAR);
            Formatter.clearScreen();
            Formatter.println("Geopardy version 1.0");
            Formatter.println();
            Formatter.println("+--------+--------+");
            Formatter.println("| Team # | Points |");
            Formatter.println("+--------+--------+");
            for ( Team team : teams ) {
                Formatter.println("| % 6d | % 6d |", team.number + 1, team.points);
            }
            Formatter.println("+--------+--------+");
            Formatter.println();
            Formatter.println();
            int width = 0;
            for ( Category cat : QuestionModel.categories ) {
                width = Math.max(width, cat.name.length());
            }
            String hSep = "+";
            for ( int i = 0; i < width + 2; i++ ) {
                hSep += "-";
            }
            hSep += hSep + hSep + hSep + hSep + "+";
            Formatter.println(hSep);
            for ( Category cat : QuestionModel.categories ) {
                Formatter.print(String.format("| %%%ds ", width), cat.name);
            }
            Formatter.println("|");
            Formatter.println(hSep);
            for ( int y = 0; y < 5; y++ ) {
                for ( int x = 0; x < 5; x++ ) {
                    String data = "";
                    if ( tilesEnabled[x][y] ) {
                        data = Integer.toString((y + 1) * 100);
                    }
                    Formatter.print(String.format("| %%%ds ", width), data);
                }
                Formatter.println("|");
            }
            Formatter.println(hSep);
            Formatter.setAbsolutePosition(0, 21);
            Formatter.println("Team: #%d", turn + 1);
            Formatter.print("Category: ");
            scan.reset();
            String in = null;
            Category cat;
            while ( in == null || (cat = findCategory(in)) == null ) {
                if ( in != null ) {
                    Formatter.setAbsolutePosition(0, 22);
                    Formatter.resetLine();
                    Formatter.print("Category: ");
                }
                in = scan.nextLine();
            }
            int cati = getCategoryIndex(cat);
            scan.reset();
            int pts = 0;
            while ( pts % 100 != 0 || pts < 100 || pts > 500 ) {
                Formatter.setAbsolutePosition(0, 23);
                Formatter.resetLine();
                Formatter.print("Points: ");
                try {
                    pts = scan.nextInt();
                } catch ( InputMismatchException ex ) {
                    pts = 1;
                }
            }
            int ptsi = pts / 100 - 1;
            if ( !tilesEnabled[cati][ptsi] ) {
                continue;
            }
            tilesEnabled[cati][ptsi] = false;
            if ( ptsi == 0 && cati == doublei ) {
                new DailyDouble().display();
                cat.questions[ptsi].display(cat, 1000, teams[turn]);
            } else {
                cat.questions[ptsi].display(cat, pts, teams[turn]);
            }
            if ( ++turn >= teams.length ) {
                turn = 0;
            }
        }
        FinalGeopardy finalQ = new FinalGeopardy();
        finalQ.display(teams);
    }
    
    public GeopardyBoard() {
        tilesEnabled = new boolean[5][5];
        for ( int x = 0; x < 5; x++ ) {
            for ( int y = 0; y < 5; y++ ) {
                tilesEnabled[x][y] = true;
            }
        }
        Random rand = new Random();
        doublei = rand.nextInt(5);
        FinalScore.INSTANCE.prepare();
        FinalScore.INSTANCE.setTeams(teams);
    }
}
