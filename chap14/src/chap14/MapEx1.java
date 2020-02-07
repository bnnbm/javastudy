package chap14;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		String[] names = {"È«±æµ¿","±è»ñ°«","ÀÌ¸ù·æ","ÀÓ²©Á¤","±è»ñ°«"}; //±è»ñ°« Áßº¹µÇ¼­ Ãß°¡¸¦ ¸øÇÏ¹Ç·Î ±âÁ¸¹ë·ùÀÎ ±è»ñ°«-4567À» ±è»ñ°«-3456À¸·Î º¯°æ
		int[] nums = {1234,4567,2350,9870,3456};
		for(int i=0; i<names.length; i++) {
			map.put(names[i], nums[i]);
		}
		System.out.println(map);
		//Value = map.get(key) => Key¿¡ ÇØ´çÇÏ´Â Value °ªÀ» ¸®ÅÏ
		System.out.println("È«±æµ¿ÀÇ ¹øÈ£:" + map.get("È«±æµ¿"));
		System.out.println("ÀÌ¸ù·æÀÇ ¹øÈ£:" + map.get("ÀÌ¸ù·æ"));
		System.out.println("±è»ñ°«ÀÇ ¹øÈ£:" + map.get("±è»ñ°«"));
		//Key°ªµé¸¸ Á¶È¸
		System.out.println("Keyµé¸¸ Á¶È¸");
		Set<String> keys = map.keySet();
		for(String k : keys) {
			System.out.println(k + "ÀÇ ¹øÈ£:" + map.get(k));
		}
		//Value °ªµé¸¸ Á¶È¸
		System.out.println("Value °ªµé¸¸ Á¶È¸");
		Collection <Integer> values = map.values(); //=> key°ª Á¶È¸ ºÒ°¡
		for(Integer v : values) {
			System.out.println(v);
		}
		//Key,ValueÀÇ ½ÖÀÎ °´Ã¼·Î Á¶È¸
		System.out.println("Key,ValueÀÇ ½ÖÀÎ °´Ã¼·Î Á¶È¸");
		Set <Map.Entry<String, Integer>> entry = map.entrySet();
		for(Map.Entry<String, Integer> m : entry) {
			System.out.println(m.getKey() + "ÀÇ ¹øÈ£:" + m.getValue());
		}
		
		
		
	}
}
