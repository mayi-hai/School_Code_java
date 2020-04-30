package experiment8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * 服务类，完成对歌曲在集合中的操作
 */
public class SongService {
	// 用于存储歌曲对象
	private List<Song> songList;

	public SongService() {
		songList = new ArrayList<>();
	}

	/**
	 * 按关键字key在集合songList中查找满足条件的 歌曲对象
	 * 
	 * @param key 查询关键字
	 * @return 存储满足条件的歌曲对象的集合
	 */
	public List<Song> search(String key) {
		List<Song> list = new ArrayList<>();
		for (Song song : songList) {
			if (song.getSongName().contains(key) ||
					song.getCategory().contains(key) || 
					song.getLanguage().contains(key)|| 
					song.getSinger().contains(key)) {
				list.add(song);
			}
		}
		return list;
	}

	/**
	 * 向集合songList中新增歌曲对象song
	 * 
	 * @param song 待新增的歌曲对象
	 * @return 新增的歌曲记录条数
	 */
	public int add(Song song) {
		if (songList.add(song)) {
			return 1;
		}
		return 0;
	}

	/**
	 * 批量新增集合c中的歌曲对象到songList中
	 * 
	 * @param c
	 * @return
	 */
	public int add(Collection<Song> c) {
		int result = 0;
		for (Song song : c) {
			result += add(song);
		}
		return result;
	}

	/**
	 * 删除歌曲song
	 * 
	 * @param song
	 * @return 删除的记录条数
	 */
	public int delete(Song song) {
		for (Song s : songList) {
			if (s.getId() == song.getId()) {
				if (songList.remove(s)) {
					return 1;
				}
			}
		}
		return 0;
	}

	/**
	 * 按关键字key在songList删除歌曲对象
	 * 
	 * @param key 关键字
	 * @return 删除歌曲的记录条数
	 */
	public int delete(String key) {
		int result = 0;
		List<Song> list = search(key);
		for (Song song : list) {
			result += delete(song);
		}
		return result;
	}

	/**
	 * 输出集合中的所有歌曲对象
	 */
	public void print(List<Song> list) {
		System.out.printf("%-10s%-15s%-15s%-15s%-15s\n", "ID", "NAME", "LANGUAGE", "CATEGORY", "SINGER");
		for (Song song : list) {
			System.out.printf("%-10d%-15s%-15s%-15s%-15s\n", song.getId(), song.getSongName(), song.getLanguage(),
					song.getCategory(), song.getSinger());
		}
	}

	public List<Song> getSongList() {
		return songList;
	}
}