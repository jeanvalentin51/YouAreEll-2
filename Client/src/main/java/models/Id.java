package models;

/* 
 * POJO for an Id object
 */
public class Id {

    private String gitHub;
    private String name;
    private String userId;

    
    public Id (String name, String githubId) {
        this.name = name;
        this.gitHub = githubId;
        this.userId = "-";
    }

    public Id(){
        this.name = null;
        this.gitHub = null;
        this.userId = "-";
    }

    public String getGitHubId (){
        return this.gitHub;
    }

    public String getName() {
        return this.name;
    }

    public String getUserId(){
        return this.userId;
    }
}