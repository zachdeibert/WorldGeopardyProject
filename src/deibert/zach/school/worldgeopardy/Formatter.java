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

public class Formatter {
    public static final String CLEAR = "[0m";
    public static final String RED = "[;31m";
    public static final String GREEN = "[0;32m";
    public static final String BLUE = "[0;34m";
    public static final String ITALICS = "[3m";
    public static final String HIDDEN_CURSOR = "[?25l";
    public static final String VISIBLE_CURSOR = "[?25h";
    
    public static void clearScreen() {
        setStyle("[2J");
        setAbsolutePosition(0, 0);
    }
    
    public static void setRelativePosition(int x, int y) {
        if ( x < 0 ) {
            setStyle(String.format("[%dD", x));
        } else if ( x > 0 ) {
            setStyle(String.format("[%dC", x));
        }
        if ( y < 0 ) {
            setStyle(String.format("[%dA", y));
        } else if ( y > 0 ) {
            setStyle(String.format("[%dB", y));
        }
    }
    
    public static void setAbsolutePosition(int x, int y) {
        setStyle("[H");
        setRelativePosition(x, y);
    }
    
    public static void resetLine() {
        setStyle("[2K");
        print("\r");
    }
    
    public static void setStyle(String style) {
        print("\033%s", style);
    }
    
    public static void print(String data) {
        System.out.print(data);
    }
    
    public static void print(String format, Object... args) {
        print(String.format(format, args));
    }
    
    public static void println(String data) {
        print(data.concat("\n"));
    }
    
    public static void println(String format, Object... args) {
        println(String.format(format, args));
    }
    
    public static void println() {
        System.out.println();
    }
}
