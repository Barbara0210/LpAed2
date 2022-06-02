package ProjAedLp2;

import java.util.ArrayList;
import java.util.HashMap;

public class BaseDeDados {

    HashMap<String, HashMap<String, String>> ways;
    HashMap<String, HashMap<String, String>> nodes;
    HashMap<String, HashMap<String, String>> tags;
    HashMap<String, HashMap<String, String>> users;
    HashMap<String, HashMap<String, String>> logs;
    HashMap<String, HashMap<String, String>> interestPoints;
    HashMap<String, HashMap<String, String>> waysTags;
    HashMap<String, HashMap<String, String>> nodeTags;
    HashMap<String, HashMap<String, String>> userLogs;
    HashMap<String, HashMap<String, String>> UsersInterestPoints;

    public HashMap<String, HashMap<String, String>> getWays() {
        return ways;
    }

    public void setWays(HashMap<String, HashMap<String, String>> ways) {
        this.ways = ways;
    }

    public HashMap<String, HashMap<String, String>> getNodes() {
        return nodes;
    }

    public void setNodes(HashMap<String, HashMap<String, String>> nodes) {
        this.nodes = nodes;
    }

    public HashMap<String, HashMap<String, String>> getTags() {
        return tags;
    }

    public void setTags(HashMap<String, HashMap<String, String>> tags) {
        this.tags = tags;
    }

    public HashMap<String, HashMap<String, String>> getUsers() {
        return users;
    }

    public void setUsers(HashMap<String, HashMap<String, String>> users) {
        this.users = users;
    }

    public HashMap<String, HashMap<String, String>> getLogs() {
        return logs;
    }

    public void setLogs(HashMap<String, HashMap<String, String>> logs) {
        this.logs = logs;
    }

    public HashMap<String, HashMap<String, String>> getInterestPoints() {
        return interestPoints;
    }

    public void setInterestPoints(HashMap<String, HashMap<String, String>> interestPoints) {
        this.interestPoints = interestPoints;
    }

    public HashMap<String, HashMap<String, String>> getWaysTags() {
        return waysTags;
    }

    public void setWaysTags(HashMap<String, HashMap<String, String>> waysTags) {
        this.waysTags = waysTags;
    }

    public HashMap<String, HashMap<String, String>> getNodeTags() {
        return nodeTags;
    }

    public void setNodeTags(HashMap<String, HashMap<String, String>> nodeTags) {
        this.nodeTags = nodeTags;
    }

    public HashMap<String, HashMap<String, String>> getUserLogs() {
        return userLogs;
    }

    public void setUserLogs(HashMap<String, HashMap<String, String>> userLogs) {
        this.userLogs = userLogs;
    }

    public HashMap<String, HashMap<String, String>> getUsersInterestPoints() {
        return UsersInterestPoints;
    }

    public void setUsersInterestPoints(HashMap<String, HashMap<String, String>> usersInterestPoints) {
        UsersInterestPoints = usersInterestPoints;
    }

    /*
    public static void inserirTag(HashMap<String, HashMap<String, String>> tags, String hashkey, ArrayList<Tags> lista) {

        lista.forEach((item) -> {
            HashMap<String, String> tag = new HashMap<String, String>();


            tag.put("item","hashedInfo" );
            tags.put("tag", tag );
        });

*/

}
