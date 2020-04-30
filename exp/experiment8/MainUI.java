package experiment8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/*
 * �����棬���ں��û�������
 * �����û������룬�����ش���Ľ��
 */
public class MainUI {
	private static int nextId = 1;
	private String menu = "*************************************\n" 
	        + "**    Song Managment System         **\n"
			+ "**************************************\n" 
	        + "* 1. search                          *\n"
			+ "* 2. add                             *\n" 
	        + "* 3. delete                          *\n"
			+ "* 4. display all song recoreds       *\n" 
	        + "* 5. exit system                     *\n"
			+ "**************************************\n" 
	        + "* please input command[1~5]:";
	private SongService service;

	public MainUI() {
		service = new SongService();
	}

	/**
	 * ����������ʾ�˵��� �����û����벢��ʾ������
	 */
	public void start() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean isStop = false;
		while (!isStop) {
			System.out.println(menu);
			String command = br.readLine();
			switch (command) {
			case "1":
				// search
				System.out.println("�������ѯ�Ĺؼ���:");
				String key = br.readLine();
				List<Song> list = service.search(key);
				System.out.println("��ѯ���Ϊ:");
				service.print(list);
				break;
			case "2":
				// add
				System.out.println("�������¸���������:");
				String name = br.readLine();
				System.out.println("�������¸��������:");
				String category = br.readLine();
				System.out.println("�������¸���������:");
				String language = br.readLine();
				System.out.println("�������¸����ĸ���:");
				String singer = br.readLine();
				Song song = new Song(nextId, name, category, language, singer);
				int rs = service.add(song);
				nextId++;
				System.out.println("������" + rs + "��������¼��");
				break;
			case "3":
				// delete
				System.out.println("�������ɾ���������:");
				String id = br.readLine();
				service.delete(id);
				System.out.println("ɾ���ɹ�");
				break;
			case "4":
				// display
				service.print(service.getSongList());
				break;
			case "5":
				// exit
				isStop = true;
				break;
			default:
				System.out.println("Error in input,try again");
				break;
			}
		}
		br.close();
		System.out.println("bye bye!");
	}

	public static void main(String[] args) {
		MainUI mui = new MainUI();
		try {
			mui.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}