import java.util.HashMap;
import java.util.Set;

public class MapOfTheHashmatiqueTest {
    public static void main(String[] args) {
        System.out.println("====== Starting MapOfTheHashmatiqueTest ======");
        System.out.println("");
        System.out.println("--- MapOfTheHashmatique TEST ----");
        System.out.println("");

        // hashmap = song title : lyrics
        HashMap<String, String> trackList = new HashMap<String, String>();

        // add songs to tracklist hashmap
        trackList.put("Just got the blues", "I've only got the blues, yeah, I've only got the blues...");
        trackList.put("Down to the river", "come on down to the river, and see the ship go by...");
        trackList.put("Band under the moon", "Oh moon of mine, sing with the band of mine...");
        trackList.put("Tear my heart", "just tear my heart out and walk away...");

        // print out one track
        System.out.println("");
        String oneTrack = trackList.get("Band under the moon");
        System.out.println("Band under the moon");
        System.out.println(oneTrack);
        System.out.println("");

        // print out all tracks with lyrics as track: lyrics
        Set<String> keys = trackList.keySet();
        for (String key : keys) {
            System.out.println(String.format("%s: %s", key, trackList.get(key)));
            System.out.println("");
        }
        System.out.println("");

        System.out.println("");

        System.out.println("");
        System.out.println("====== End of MapOfTheHashmatiqueTest ======");
    }
}