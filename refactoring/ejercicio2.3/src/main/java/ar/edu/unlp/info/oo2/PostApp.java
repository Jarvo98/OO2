package ar.edu.unlp.info.oo2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PostApp {
    private List<Post> posts;

    public PostApp() {
        this.posts = new ArrayList<Post>();
    }

    public List<Post> ultimosPosts(Usuario usuario, int cantidad) {
        return this.posts
                .stream()
                .filter(post -> !post.getUsuario().equals(usuario))
                .sorted(Comparator.comparing(Post::getFecha))
                .limit(cantidad)
                .collect(Collectors.toList());
    }
}
