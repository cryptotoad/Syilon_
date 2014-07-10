/*
 * The MIT License
 *
 * Copyright 2014 PFM.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package syilonloader;

/**
 *
 * @author s4b0t4g3
 */
public class syilonFiles {
    public String getCharacterFile(String playerName) {
        //returns the character file for the given playe
        return "";
    }
    
    public boolean zipSourceFolder(String outputDirectory) {
        //returns true if it's able to zip the source folder, false if there is an issue
        return false;
    }
    
    public static String findDataDirectory() {
        String pathToSource = System.getProperty("user.dir");
        if(pathToSource.contains("bin")) {
            //if we're in the compiled source directory
            pathToSource = pathToSource.replaceAll(pathToSource.substring(pathToSource.indexOf("/bin/")), "/data/");
            return pathToSource;
        } else {
            return "ERR:0"; //error 0 - cannot find data directory
        }
        
    }
}
