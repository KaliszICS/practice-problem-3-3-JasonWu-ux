import java.util.ArrayList;

public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static ArrayList<String> perms(String str) {
		ArrayList<String> result = new ArrayList<>();
		calculatePerms("", str, result);
		return result;
	}
	public static void calculatePerms(String p, String r, ArrayList<String> result) {
	if (r.isEmpty()) {
		result.add(p);
		return;

	}
	for (int i = 0; i < r.length(); i++) {
		calculatePerms(p + r.charAt(i), r.substring(0, i) + r.substring(i + 1), result);

	}
}
	public static ArrayList<String> permsUnique(String str) {
        ArrayList<String> result = new ArrayList<>();
        calculateUnique("", str, result);
        return result;
		}
		  private static void calculateUnique(String p, String r, ArrayList<String> res) {
        if (r.isEmpty()) {
            res.add(p);
            return;
        }
		boolean[] used = new boolean[256];
		for (int i = 0; i < r.length(); i++) {
			char ch = r.charAt(i);
			if (!used[ch]) {
        	used[ch] = true;
          	calculateUnique(p + ch, r.substring(0, i) + r.substring(i + 1), res);
		}
}
}
}