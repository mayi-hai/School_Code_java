package experiment8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/*
 * 主界面，用于和用户交互，
 * 接收用户的输入，并返回处理的结果
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
	 * 启动程序，显示菜单， 接收用户输入并显示处理结果
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
				System.out.println("请输入查询的关键字:");
				String key = br.readLine();
				List<Song> list = service.search(key);
				System.out.println("查询结果为:");
				service.print(list);
				break;
			case "2":
				// add
				System.out.println("请输入新歌曲的名称:");
				String name = br.readLine();
				System.out.println("请输入新歌曲的类别:");
				String category = br.readLine();
				System.out.println("请输入新歌曲的语言:");
				String language = br.readLine();
				System.out.println("请输入新歌曲的歌手:");
				String singer = br.readLine();
				Song song = new Song(nextId, name, category, language, singer);
				int rs = service.add(song);
				nextId++;
				System.out.println("新增了" + rs + "条歌曲记录！");
				break;
			case "3":
				// delete
				System.out.println("请输入待删除歌曲编号:");
				String id = br.readLine();
				service.delete(id);
				System.out.println("删除成功");
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