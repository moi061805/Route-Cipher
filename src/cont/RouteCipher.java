package cont;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class RouteCipher
	{
	//This class counstructs the route cipher
		
		
		String msg = "Write a number";
		String msg2 = "Write a message";
		
		private int row;
		private int col;
		
		private int arr1[][];
		
		private String sam;
		
		public RouteCipher() {
			
			arrayNumber();
			code();
			JOP.msg(sam);
			//System.out.println(row);
			
			
			//System.out.println ();
			    
		}
		//it claculates how big the array is going to be
		public void arrayNumber() {
			String message = JOP.in(msg);
			int number = Integer.parseInt(message.trim());
			
			int i = (int)Math.sqrt(Math.sqrt(number));
			
			row = i;
			col = i;
			System.out.println(col);
		}
		//it changes the letters in the array
		public void code() {
			char[][] arr = new char[row][col];
			
			
			String message2 = JOP.in(msg2);
			
			
			int offset = 0;
			for (int x=0; x < row; x++) {
			    for (int j=0; j < col; j++) {
			    	if (offset < message2.length()) {
			    		arr[x][j] = message2.charAt(offset++);
			    	}
			    	else {
			    		arr[x][j] = 'A';
			    	}
			    	if(arr[x][j] == 'a') {
			    		arr[x][j] = '$';
			    	}if(arr[x][j] == 'b') {
			    		arr[x][j] = '^';
			    	}if(arr[x][j] == 'c') {
			    		arr[x][j] = '!';
			    	}if(arr[x][j] == 'd') {
			    		arr[x][j] = '@';
			    	}if(arr[x][j] == 'e') {
			    		arr[x][j] = '#';
			    	}if(arr[x][j] == 'f') {
			    		arr[x][j] = '%';
			    	}if(arr[x][j] == 'g') {
			    		arr[x][j] = '&';
			    	}if(arr[x][j] == 'h') {
			    		arr[x][j] = '*';
			    	}if(arr[x][j] == 'i') {
			    		arr[x][j] = '(';
			    	}if(arr[x][j] == 'j') {
			    		arr[x][j] = ')';
			    	}if(arr[x][j] == 'k') {
			    		arr[x][j] = '-';
			    	}if(arr[x][j] == 'l') {
			    		arr[x][j] = ',';
			    	}if(arr[x][j] == 'm') {
			    		arr[x][j] = '/';
			    	}if(arr[x][j] == 'n') {
			    		arr[x][j] = '*';
			    	}if(arr[x][j] == 'o') {
			    		arr[x][j] = '~';
			    	}if(arr[x][j] == 'p') {
			    		arr[x][j] = '`';
			    	}if(arr[x][j] == 'q') {
			    		arr[x][j] = '"';
			    	}if(arr[x][j] == 'r') {
			    		arr[x][j] = '=';
			    	}if(arr[x][j] == 's') {
			    		arr[x][j] = '+';
			    	}if(arr[x][j] == 't') {
			    		arr[x][j] = '1';
			    	}if(arr[x][j] == 'u') {
			    		arr[x][j] = '2';
			    	}if(arr[x][j] == 'v') {
			    		arr[x][j] = '[';
			    	}if(arr[x][j] == 'w') {
			    		arr[x][j] = ']';
			    	}if(arr[x][j] == 'x') {
			    		arr[x][j] = '<';
			    	}if(arr[x][j] == 'y') {
			    		arr[x][j] = '>';
			    	}if(arr[x][j] == 'z') {
			    		arr[x][j] = '?';
			    	}if(arr[x][j] == ' ') {
			    		arr[x][j] = '_';
			    	}if(arr[x][j] == '.') {
			    		arr[x][j] = '|';
			    	}
			    	
			    	for (int u=0; u < row; u++) {
					    for (int a=0; a < col; a++) {
					    	if(arr[x][j] == '$') {
					    		arr[x][j] = 'a';}
					    	if(arr[x][j] == '^') {
					    		arr[x][j] = 'b';
					    	}if(arr[x][j] == '!') {
					    		arr[x][j] = 'c';
					    	}if(arr[x][j] == '@') {
					    		arr[x][j] = 'd';
					    	}if(arr[x][j] == '#') {
					    		arr[x][j] = 'e';
					    	}if(arr[x][j] == '%') {
					    		arr[x][j] = 'f';
					    	}if(arr[x][j] == '&') {
					    		arr[x][j] = 'g';
					    	}if(arr[x][j] == '*') {
					    		arr[x][j] = 'h';
					    	}if(arr[x][j] == '(') {
					    		arr[x][j] = 'i';
					    	}if(arr[x][j] == ')') {
					    		arr[x][j] = 'j';
					    	}if(arr[x][j] == '-') {
					    		arr[x][j] = 'k';
					    	}if(arr[x][j] == ',') {
						    	arr[x][j] = 'l';	
						   	}if(arr[x][j] == '/') {
						    	arr[x][j] = 'm';
						    }if(arr[x][j] == '*') {
						    	arr[x][j] = 'n';
						    }if(arr[x][j] == '~') {
						    	arr[x][j] = 'o';
						    }if(arr[x][j] == '`') {
						    	arr[x][j] = 'p';
						    }if(arr[x][j] == '"') {
						    	arr[x][j] = 'q';
					    	}if(arr[x][j] == '=') {
					    		arr[x][j] = 'r';
					    	}if(arr[x][j] == '+') {
					    		arr[x][j] = 's';
					    	}if(arr[x][j] == '2') {
					    		arr[x][j] = 't';
					    	}if(arr[x][j] == '1') {
					    		arr[x][j] = 'u';
					    	}if(arr[x][j] == '[') {
					    		arr[x][j] = 'v';
					    	}if(arr[x][j] == ']') {
					    		arr[x][j] = 'w';
					    	}if(arr[x][j] == '<') {
					    		arr[x][j] = 'x';
					    	}if(arr[x][j] == '>') {
					    		arr[x][j] = 'y';
					    	}if(arr[x][j] == '?') {
					    		arr[x][j] = 'z';
					    	}if(arr[x][j] == '_') {
					    		arr[x][j] = ' ';
					    	}if(arr[x][j] == '|') {
					    		arr[x][j] = '.';
					    	}
			    	
			    	 String s = "";
					    for (int m=0; m < arr.length; m++) {
					        for (int n=0; n < arr[m].length; n++) {
					            s += arr[m][n];
					        }
					      
					        s += "\n";
					    }
			
					    sam = s.toString();
					    
					
					    }
			    }
		}
			}
			
			

			
		}
//It diplays the new array with the letters changed
		public static void printArray(String[][] num1) {
		    String output = "";
		    for (int x = 0; x < num1.length; x++) {
		        output += Arrays.toString(num1[x]) + "\n";
		    }
		    JOptionPane.showMessageDialog(null, output, "Uitvoer",
		            JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//	    }
		
		

//	
//	int pos = 0;
//	for (int r = 0; r < row; r++ ) {
//		for (int c = 0; c < col; c++ ) {
//			if (pos < message2.length()) {
//				letterBlock[r][c] = "X";
//				System.out.print(letterBlock[r][c]);
//				//letterBlock[r][c] = message2.substring(pos, pos+1);
//				pos++;
//			} 
//			else {
//				letterBlock[r][c] = "A";
//				System.out.println();
//			}
//			
//	    }
//		
//	}
//	
	
	
	
	//String str1 = Integer.toString(numCols);
	//JOP.msg(str1);
	//fillBlock(message);
	

	
		
		
		
		
		
		
		
		
		
		
		
		//private int mathNum(String str) {
			
			//int i = (int) Math.sqrt(Math.sqrt(number));
			//int result = (int)i;
			
			//return i;
			
		//}
		
//		public void fillBlock(String str)
//		{ 
//			
//			
//		}
		/** Extracts encrypted string from letterBlock in column-major order.
		* Precondition: letterBlock has been filled
		* @return the encrypted string from letterBlock
		*/
		//private String encryptBlock()
		{ /* implementation not shown */ }
		/** Encrypts a message.
		* @param message the string to be encrypted
		* @return the encrypted message;
		* if message is the empty string, returns the empty string
		*/
//		public String encryptMessage(String message) {
//			String encryptedMessage = "";
//			int chunkSize = this.numRows * this.numCols;
//			while (message.length() > 0) {
//				if (chunkSize > message.length()) {
//					chunkSize = message.length();
//				}
//			fillBlock(message);
//			encryptedMessage += encryptBlock();
//			message = message.substring(chunkSize);
//				}
//					return encryptedMessage;
//				}
//		
		
	}

	
