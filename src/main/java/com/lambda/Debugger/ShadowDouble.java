/*                        ShadowDouble.java

  Copyright 2003, Bil Lewis

  This program is free software; you can redistribute it and/or modify
  it under the terms of the GNU General Public License as published by
  the Free Software Foundation; either version 2 of the License, or
  (at your option) any later version.
  
  This program is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU General Public License for more details.
  
  You should have received a copy of the GNU General Public License
  along with this program; if not, write to the Free Software
  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA   
*/

package com.lambda.Debugger;

public class ShadowDouble implements ShadowPrimitive  {
    private double value;
    private String printString;

    ShadowDouble(double i) {
	value = i;
    }

  public static ShadowDouble createShadowDouble(double i) {
      return new ShadowDouble(i);
  }

    public String toString() {
	//	return "<Sd "+ value +">";
	if (printString == null) printString = Double.toString(value);
	return printString;
    }
  public double doubleValue() {
    return value;
  }

    public Class getType() {return double.class;}


}