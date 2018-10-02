import java.util.*;
favs = albums.stream()
.filter(e -> e.tracks.stream()
	.sorted(Comparator.reverseOrder())
	.collect(Collectors.toList())
	.get(0) > 4)
.collect(Collectors.toList());