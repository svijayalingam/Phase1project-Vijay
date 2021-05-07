package lockedMe;

import java.util.InputMismatchException;
import java.util.Scanner;
import lockedMe.FileAdd;
import lockedMe.FileDel;
import lockedMe.FileDisplay;
import lockedMe.FileSrch;

public class LockedMe {
	private static final String Welcome_Promt=
			"\n****LockedMe.com****"+
	"\n****svijayalingam****\n";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Welcome_Promt);
		String path=System.getProperty("user.dir");
		System.out.println("Directory="+path);

		int opt=0;
		do {
			try {
				Scanner i =new Scanner(System.in);
				System.out.println("Please select from the options below and press Enter:");
				System.out.println("option 1: Sort files");
				System.out.println("option 2: File operation");
				System.out.println("option 3: Exit Application");
				System.out.println("==============================");
				
				opt =i.nextInt();
				
				switch (opt) {
				case 1:
					Scanner s1=new Scanner(System.in);
					System.out.println("Sorting the files now");
					FileDisplay d=new FileDisplay();
					d.srtFile();
					System.out.println("============================");
					
					break;
					
				case 2:
					String opt2=null;
					String optD="D";
					{
					do {
						
					Scanner i2=new Scanner(System.in);
					System.out.println("Please Select from the options below and press Enter:");
					System.out.println("Option A: Create a Text file");
					System.out.println("option B: Delete a Text file");
					System.out.println("option C: Search for a Text file");
					System.out.println("option D: Go back to Main menu");
					System.out.println("======================================");
					
					opt2 = i2.nextLine();
					switch (opt2) {
					case "A":
						Scanner s2=new Scanner(System.in);
						System.out.println("Please enter the text file name that you would like to create: ");
						System.out.println("Please enter file name without the extension");
						String str1=s2.nextLine();
						FileAdd a=new FileAdd();
						a.creFile(str1);
						System.out.println("================================");
						break;
					case "B":
					Scanner s3=new Scanner(System.in);
					System.out.println("Please enter the text file name that you would like to delete: ");
					System.out.println("Please enter the file name without the extension");
					String str2=s3.nextLine();
					FileDel b=new FileDel();
					b.delFile(str2);
					System.out.println("=========================================");
					
					break;
					case "C":
					Scanner s4=new Scanner(System.in);
					System.out.println("Please enter the text file name that you would like to search");
					System.out.println("Please enter the file name without the extension");
					String str3=s4.nextLine();
					FileSrch c=new FileSrch();
					c.srchFile(str3);
					System.out.println("=========================================");
					
					break;
					case "D":
						break;
						default:
							System.err.println("Please choose a valid option A thu D");
							System.out.println("======================================");
							
							break;
					}
					}while(!(opt2.equals(optD)));
					break;
					}
					case 3:
						System.out.println("Good Bye:)");
						System.out.println("========================================");
						break;
						default:
						System.err.println("Please choose a valid option 1 thru 3");						
						System.out.println("===================================");
				}
					}
			catch(InputMismatchException e) {
				System.err.println("Please enter a number");
				System.out.println("=================================");
			}
		}while(opt!=3);
	}
	}
				