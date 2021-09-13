package ch02;
import java.io.*;
public class Ch_2_2_numberfoundcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=2) {
			System.out.println("请输入两个文件名！！！");
		}else {
			String infile=args[0];
			String outfile=args[1];
			try {
				BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(infile),"GBK"));
				String lineBuffer;
				StringBuffer ages=new StringBuffer();
				while(null!=(lineBuffer=br.readLine())) {
					for(int i=0;i<lineBuffer.length();i++) {
						if((lineBuffer.charAt(i)>='0')&&(lineBuffer.charAt(i)<='9'))
							ages.append(lineBuffer.charAt(i));
					}
					ages.append("\r\n");
				}
				br.close();
				FileOutputStream fos=new FileOutputStream(outfile);
				BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(fos,"GBK"));
				bw.write(ages.toString());
				bw.close();
			}catch(Exception e) {
				System.out.println("文件处理发生错误！！！");
				System.out.println("输入文件名："+infile);
				System.out.println("输出文件名:"+outfile);
				System.out.println("错误信息："+e.getMessage());
			}
		}
	}

}
