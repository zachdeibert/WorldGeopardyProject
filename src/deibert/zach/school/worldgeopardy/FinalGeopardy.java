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
import java.util.Scanner;

public class FinalGeopardy {
    protected int getTeamsPoints(Team team) {
        if ( team.points < 0 ) {
            return 0;
        }
        Formatter.setStyle(Formatter.CLEAR);
        Formatter.clearScreen();
        Formatter.setStyle(Formatter.BLUE);
        Formatter.print("Team #%d: ", team.number + 1);
        Formatter.setStyle(Formatter.ITALICS);
        Formatter.println("%d points", team.points);
        Formatter.println();
        Formatter.setStyle(Formatter.CLEAR);
        Formatter.setStyle(Formatter.GREEN);
        Formatter.println("How many points will you bet for Final Geopardy [0 ~ %d]?", team.points);
        Scanner scan = new Scanner(System.in);
        scan.reset();
        int points = -1;
        while ( points < 0 || points > team.points ) {
            Formatter.setAbsolutePosition(0, 3);
            Formatter.resetLine();
            try {
                points = scan.nextInt();
            } catch ( InputMismatchException ex ) {
                points = -2;
            }
        }
        return points;
    }
    
    public void fakeQuestion(Category cat, Team team, int pts, String number, String msg) throws InterruptedException {
        Formatter.setStyle(Formatter.CLEAR);
        Formatter.clearScreen();
        Formatter.setStyle(Formatter.BLUE);
        Formatter.print("Team #%d: ", team.number + 1);
        Formatter.setStyle(Formatter.ITALICS);
        Formatter.println("%d points", team.points);
        Formatter.println();
        Formatter.setStyle(Formatter.CLEAR);
        Formatter.setStyle(Formatter.GREEN);
        Formatter.println("%s:", cat.name);
        Formatter.println("What was the %s word outputed by this program [%d points]?", number, pts);
        Formatter.setStyle(Formatter.CLEAR);
        Formatter.print("  a. ");
        Formatter.setStyle(Formatter.ITALICS);
        Formatter.println("Copyright");
        Formatter.setStyle(Formatter.CLEAR);
        Formatter.print("  b. ");
        Formatter.setStyle(Formatter.ITALICS);
        Formatter.println("Geopardy");
        Formatter.setStyle(Formatter.CLEAR);
        Formatter.print("  c. ");
        Formatter.setStyle(Formatter.ITALICS);
        Formatter.println("This");
        Formatter.setStyle(Formatter.CLEAR);
        Formatter.print("  d. ");
        Formatter.setStyle(Formatter.ITALICS);
        Formatter.println("2015");
        Formatter.setStyle(Formatter.CLEAR);
        Formatter.print("  e. ");
        Formatter.setStyle(Formatter.ITALICS);
        Formatter.println("Zach");
        Formatter.setStyle(Formatter.CLEAR);
        Formatter.print("  f. ");
        Formatter.setStyle(Formatter.ITALICS);
        Formatter.println("Code");
        Formatter.setStyle(Formatter.CLEAR);
        Formatter.print("  g. ");
        Formatter.setStyle(Formatter.ITALICS);
        Formatter.println("Is");
        Formatter.setStyle(Formatter.CLEAR);
        Formatter.println();
        Formatter.print("Your answer: ");
        Thread.sleep(8000);
        Formatter.println();
        Formatter.println();
        Formatter.println(msg);
        Thread.sleep(2000);
    }
    
    public void display(Team teams[]) {
        try {
            int pts[] = new int[teams.length];
            for ( int i = 0; i < teams.length; i++ ) {
                pts[i] = getTeamsPoints(teams[i]);
            }
            Category cat = new Category("Final Geopardy");
            for ( int i = 0; i < teams.length; i++ ) {
                if ( pts[i] > 0 ) {
                    fakeQuestion(cat, teams[i], pts[i], "first", "Okay.  Maybe that was not the question.  Here is the actual question:");
                    fakeQuestion(cat, teams[i], pts[i], "second", "Here is the 4real question 4 you to answers:");
                    break;
                }
            }
            for ( int i = 0; i < teams.length; i++ ) {
                if ( pts[i] > 0 ) {
                    QuestionModel.finalQuestion.display(cat, pts[i], teams[i]);
                }
            }
        } catch ( InterruptedException ex ) {
        }
    }
}
