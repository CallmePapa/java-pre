package Date;

public class system {
	public static void main(String args[]) {
			String osName=System.getProperty("os.name");
			String osArch=System.getProperty("os.arch");
			String osVersion=System.getProperty("os.version");
			System.out.println("����ϵͳ����"+osName + ",����ϵͳ�汾 v" + osVersion+",����ϵͳ�ܹ�:"+osArch);
			String userName=System.getProperty("user.name");
			String userHome=System.getProperty("user.home");
			 System.out.println("�û�����"+userName + ",�û���Ŀ¼" + userHome);
			 String path=System.getProperty("path.separstor");
			 String file=System.getProperty("file.separstor");
			 System.out.println("·���ָ�����"+path + ",�ļ��ָ���" +file);
	}
}
