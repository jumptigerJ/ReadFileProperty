import java.io.File;

public class ReadFileProperty {

	public static void main(String[] args) {
		File file = new File("test.txt");
		//�ж��ļ��Ƿ����
		System.out.println("�ж��ļ��Ƿ����"+file.exists());
		//��ȡ�ļ�����
		System.out.println("��ȡ�ļ�����"+file.getName());
		//��ȡ�ļ�·��
		System.out.println("��ȡ�ļ�·��"+file.getPath());
		//��ȡ�ļ��ľ���·��
		System.out.println("��ȡ�ļ��ľ���·��"+file.getAbsolutePath());
		//��ȡ�ļ�����·��
		System.out.println("��ȡ�ļ�����·��"+new File(file.getAbsolutePath()).getParent());
		//��ȡ�ļ���С
		System.out.println("��ȡ�ļ���С"+ file.length() +"byte");
		//�ж��ļ��Ƿ�����
		System.out.println("�ж��ļ��Ƿ�����"+file.isHidden());
		//�ж��ļ��Ƿ�ɶ�
		System.out.println("�ж��ļ��Ƿ�ɶ�"+file.canRead());
		//�ж��ļ��Ƿ��д
		System.out.println("�ж��ļ��Ƿ��д"+file.canWrite());
		//�ж��ļ��Ƿ�Ϊ�ļ���
		System.out.println("�ж��ļ��Ƿ�Ϊ�ļ���"+file.isDirectory());
		

	}

}
