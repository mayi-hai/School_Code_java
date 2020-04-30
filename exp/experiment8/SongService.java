package experiment8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * �����࣬��ɶԸ����ڼ����еĲ���
 */
public class SongService {
	// ���ڴ洢��������
	private List<Song> songList;

	public SongService() {
		songList = new ArrayList<>();
	}

	/**
	 * ���ؼ���key�ڼ���songList�в������������� ��������
	 * 
	 * @param key ��ѯ�ؼ���
	 * @return �洢���������ĸ�������ļ���
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
	 * �򼯺�songList��������������song
	 * 
	 * @param song �������ĸ�������
	 * @return �����ĸ�����¼����
	 */
	public int add(Song song) {
		if (songList.add(song)) {
			return 1;
		}
		return 0;
	}

	/**
	 * ������������c�еĸ�������songList��
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
	 * ɾ������song
	 * 
	 * @param song
	 * @return ɾ���ļ�¼����
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
	 * ���ؼ���key��songListɾ����������
	 * 
	 * @param key �ؼ���
	 * @return ɾ�������ļ�¼����
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
	 * ��������е����и�������
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