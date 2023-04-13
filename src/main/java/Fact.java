import com.fasterxml.jackson.annotation.JsonProperty;

public class Fact {
    private final String id;
    private final String text;
    private final String type;
    private final String user;
    private final Integer upVotes;

    public Fact(@JsonProperty ("id") String id,
                @JsonProperty ("text") String text,
                @JsonProperty ("type") String type,
                @JsonProperty ("user") String user,
                @JsonProperty ("upvotes") Integer upVotes
    ) {
       this.id = id;
       this.text = text;
       this.type = type;
       this.user = user;
       this.upVotes = upVotes;
    }

    public Integer getUpVotes() {
        return upVotes;
    }

    @Override
    public String toString() {
        return "Id: " + id +
                "\nText: " + text +
                "\nType: " + type +
                "\nUser: " + user +
                "\nVotes: " + upVotes + "\n";
    }
}
