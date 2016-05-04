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

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FinalScore extends Thread {
    public static final FinalScore INSTANCE = new FinalScore();
    private Team teams[] = new Team[0];
    
    @Override
    public void run() {
        Formatter.setStyle(Formatter.CLEAR);
        Formatter.clearScreen();
        Formatter.println("Final Scores:");
        Formatter.println();
        Formatter.println("+--------+--------+");
        Formatter.println("| Team # | Points |");
        Formatter.println("+--------+--------+");
        List<Team> teams = Arrays.asList(this.teams);
        teams.sort(new TeamComparator());
        for ( Team team : teams ) {
            Formatter.println("| % 6d | % 6d |", team.number + 1, team.points);
        }
        Formatter.println("+--------+--------+");
        Formatter.setStyle(Formatter.CLEAR);
        Runtime.getRuntime().halt(0);
    }
    
    public void setTeams(Team teams[]) {
        this.teams = teams;
    }
    
    public void prepare() {
        Runtime.getRuntime().addShutdownHook(this);
    }
    
    private FinalScore() {
    }
}
