package Date;

public class system {
	public static void main(String args[]) {
			String osName=System.getProperty("os.name");
			String osArch=System.getProperty("os.arch");
			String osVersion=System.getProperty("os.version");
			System.out.println("操作系统名："+osName + ",操作系统版本 v" + osVersion+",操作系统架构:"+osArch);
			String userName=System.getProperty("user.name");
			String userHome=System.getProperty("user.home");
			 System.out.println("用户名："+userName + ",用户主目录" + userHome);
			 String path=System.getProperty("path.separstor");
			 String file=System.getProperty("file.separstor");
			 System.out.println("路径分隔符："+path + ",文件分隔符" +file);
	}
}
