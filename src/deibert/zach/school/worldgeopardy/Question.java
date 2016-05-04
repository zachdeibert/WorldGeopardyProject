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

import java.util.Scanner;

public class Question {
    public final String question;
    public final String answers[];
    public final int correctAnswer;
    
    public void display(Category category, int points, Team team) {
        Formatter.setStyle(Formatter.CLEAR);
        Formatter.clearScreen();
        Formatter.setStyle(Formatter.BLUE);
        Formatter.print("Team #%d: ", team.number + 1);
        Formatter.setStyle(Formatter.ITALICS);
        Formatter.println("%d points", team.points);
        Formatter.println();
        Formatter.setStyle(Formatter.CLEAR);
        Formatter.setStyle(Formatter.GREEN);
        Formatter.println("%s:", category.name);
        if ( question.contains("?") ) {
            Formatter.println(question.replace("?", String.format(" [%d points]?", points)));
        } else {
            Formatter.println(String.format("%s [%d points]", question, points));
        }
        Formatter.setStyle(Formatter.CLEAR);
        for ( int i = 0; i < answers.length; i++ ) {
            Formatter.print("  %c. ", 'a' + i);
            Formatter.setStyle(Formatter.ITALICS);
            Formatter.println(answers[i]);
            Formatter.setStyle(Formatter.CLEAR);
        }
        Formatter.println();
        Formatter.print("Your answer: ");
        Scanner scan = new Scanner(System.in);
        scan.reset();
        char answer = 0;
        while ( answer < 'a' || answer > 'a' + answers.length ) {
            if ( answer != 0 ) {
                Formatter.setRelativePosition(0, -1);
                Formatter.resetLine();
                Formatter.print("Your answer: ");
            }
            try {
                answer = scan.nextLine().toLowerCase().toCharArray()[0];
            } catch ( IndexOutOfBoundsException ex ) {
                answer = 1;
            }
        }
        Formatter.setStyle(Formatter.CLEAR);
        Formatter.setStyle(Formatter.BLUE);
        Formatter.println();
        if ( answer - 'a' != correctAnswer ) {
            Formatter.println("You got it wrong :(");
            team.points -= points;
        } else {
            Formatter.println("You got it right :)");
            team.points += points;
        }
        Formatter.print("You now have ");
        Formatter.setStyle(Formatter.ITALICS);
        Formatter.print("%d points", team.points);
        Formatter.println();
        Formatter.setStyle(Formatter.CLEAR);
        Formatter.println("Press [ENTER] to continue");
        scan.nextLine();
    }
    
    public Question(String question, String answers[], int correctAnswer) throws IllegalArgumentException {
        if ( answers.length < 2 || answers.length > 26 ) {
            throw new IllegalArgumentException("There must be between 2 and 26 answers");
        }
        if ( correctAnswer < 0 || correctAnswer >= answers.length ) {
            throw new IllegalArgumentException("The correct answer is not existant");
        }
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }
}
