package tech.tresearchgroup.schemas.galago.entities;

import io.activej.serializer.annotations.Deserialize;
import io.activej.serializer.annotations.Serialize;
import io.activej.serializer.annotations.SerializeNullable;
import tech.tresearchgroup.palila.model.BasicFormObject;
import tech.tresearchgroup.palila.model.BasicObjectInterface;
import tech.tresearchgroup.palila.model.LockType;

import java.util.Date;

public class NewsArticleEntity extends BasicFormObject implements BasicObjectInterface {
    private transient Date created;

    private transient Date updated;

    private Long id;

    private LockType lockType;
    private boolean unread;

    private String title;

    private String preview;

    private String body;

    public NewsArticleEntity() {
    }

    public NewsArticleEntity(@Deserialize("created") Date created,
                             @Deserialize("updated") Date updated,
                             @Deserialize("id") Long id,
                             @Deserialize("lockType") LockType lockType,
                             @Deserialize("unread") boolean unread,
                             @Deserialize("title") String title,
                             @Deserialize("preview") String preview,
                             @Deserialize("body") String body) {
        this.created = created;
        this.updated = updated;
        this.id = id;
        this.lockType = lockType;
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
    @SerializeNullable
    public LockType getLockType() {
        return lockType;
    }

    @Serialize(order = 4)
    public boolean isUnread() {
        return unread;
    }

    @Serialize(order = 5)
    @SerializeNullable
    public String getTitle() {
        return title;
    }

    @Serialize(order = 6)
    @SerializeNullable
    public String getPreview() {
        return preview;
    }

    @Serialize(order = 7)
    @SerializeNullable
    public String getBody() {
        return body;
    }

    @Override
    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public void setLockType(LockType lockType) {
        this.lockType = lockType;
    }

    public void setUnread(boolean unread) {
        this.unread = unread;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
