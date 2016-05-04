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

public class Copyright {
    public void display() {
        Formatter.setStyle(Formatter.CLEAR);
        Formatter.clearScreen();
        Formatter.println("Copyright (c) 2015, Zach Deibert");
        Formatter.println("QuestionModel.java and QuestionModel.class Copyright (c) 2015, Zach Deibert, Andrew Krenzel, and Mark Garcia");
        Formatter.println("All rights reserved.");
        Formatter.println();
        Formatter.println("Redistribution and use in source and binary forms, with or without");
        Formatter.println("modification, are permitted provided that the following conditions are met:");
        Formatter.println();
        Formatter.println("* Redistributions of source code must retain the above copyright notice, this");
        Formatter.println("  list of conditions and the following disclaimer.");
        Formatter.println("* Redistributions in binary form must reproduce the above copyright notice,");
        Formatter.println("  this list of conditions and the following disclaimer in the documentation");
        Formatter.println("  and/or other materials provided with the distribution.");
        Formatter.println();
        Formatter.println("THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS \"AS IS\"");
        Formatter.println("AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE");
        Formatter.println("IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE");
        Formatter.println("ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE");
        Formatter.println("LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR");
        Formatter.println("CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF");
        Formatter.println("SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS");
        Formatter.println("INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN");
        Formatter.println("CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)");
        Formatter.println("ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE");
        Formatter.println("POSSIBILITY OF SUCH DAMAGE.");
        Formatter.println();
        Formatter.println();
        Formatter.print("Please type \"yes\" (without quotes) to accept the license: ");
        Scanner scan = new Scanner(System.in);
        scan.reset();
        String in = null;
        while ( in == null || !in.equals("yes") ) {
            if ( in != null ) {
                Formatter.setRelativePosition(0, -1);
                Formatter.resetLine();
                Formatter.print("Please type \"yes\" (without quotes) to accept the license: ");
            }
            in = scan.nextLine();
        }
    }
}
