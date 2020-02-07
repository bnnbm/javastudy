package chap19;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/*
 * File에서 읽은 내용을 스트림으로 생성하기
 */
public class FileToStreamEx1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(new File("src/chap19/FilterStreamEx1.java")));
		br.lines().forEach(s->System.out.println(s));
		
		System.out.println("폴더 목록을 스트림을 이용하여 화면에 출력");
		Path path = Paths.get("src/chap19");
		Stream<Path> st = Files.list(path);
		st.forEach(p->System.out.println(p.getFileName()));
	}
}