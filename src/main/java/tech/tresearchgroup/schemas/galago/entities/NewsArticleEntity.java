package tech.tresearchgroup.schemas.galago.entities;

import io.activej.serializer.annotations.Deserialize;
import io.activej.serializer.annotations.Serialize;
import io.activej.serializer.annotations.SerializeNullable;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.tresearchgroup.palila.model.BasicObjectInterface;

import java.util.Date;

@Data
@NoArgsConstructor
public class NewsArticleEntity implements BasicObjectInterface {
    private transient Date created;

    private transient Date updated;

    private Long id;

    private boolean unread;

    private String title;

    private String preview;

    private String body;

    public NewsArticleEntity(@Deserialize("created") Date created,
                             @Deserialize("updated") Date updated,
                             @Deserialize("id") Long id,
                             @Deserialize("unread") boolean unread,
                             @Deserialize("title") String title,
                             @Deserialize("preview") String preview,
                             @Deserialize("body") String body) {
        this.created = created;
        this.updated = updated;
        this.id = id;
        this.unread = unread;
        this.title = title;
        this.preview = preview;
        this.body = body;
    }

    @Serialize(order = 0)
    @SerializeNullable
    public Date getCreated() {
        return created;
    }

    @Serialize(order = 1)
    @SerializeNullable
    public Date getUpdated() {
        return updated;
    }

    @Serialize(order = 2)
    @SerializeNullable
    public Long getId() {
        return id;
    }

    @Serialize(order = 3)
    public boolean isUnread() {
        return unread;
    }

    @Serialize(order = 4)
    @SerializeNullable
    public String getTitle() {
        return title;
    }

    @Serialize(order = 5)
    @SerializeNullable
    public String getPreview() {
        return preview;
    }

    @Serialize(order = 6)
    @SerializeNullable
    public String getBody() {
        return body;
    }
}
