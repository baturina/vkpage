package ru.netology.domain;
public class PostManager {


    private Post[] objects;

    public void Post(Post []objects) {
        this.objects = objects;
    }

    public Post search(int ownerId, String domain, String query, int ownersOnly, int count, int offset) {

        return null;
    }

    public Post[] getObjects() {

        return null;
    }

    public void delete(int ownerId, int post_id) {

    }
}
