package tech.tresearchgroup.schemas.galago.entities;

import io.activej.serializer.annotations.Deserialize;
import io.activej.serializer.annotations.Serialize;
import io.activej.serializer.annotations.SerializeNullable;
import tech.tresearchgroup.palila.model.BasicFormObject;
import tech.tresearchgroup.palila.model.BasicObjectInterface;
import tech.tresearchgroup.palila.model.LockType;

import java.util.Date;

public class SubtitleEntity extends BasicFormObject implements BasicObjectInterface {

    private transient Date created;

    private transient Date updated;

    private Long id;

    private LockType lockType;
    private String language;

    private String data;

    private Long views;

    public SubtitleEntity() {
    }

    public SubtitleEntity(@Deserialize("created") Date created,
                          @Deserialize("updated") Date updated,
                          @Deserialize("id") Long id,
                          @Deserialize("lockType") LockType lockType,
                          @Deserialize("language") String language,
                          @Deserialize("data") String data,
                          @Deserialize("views") Long views) {
        this.created = created;
        this.updated = updated;
        this.id = id;
        this.lockType = lockType;
        this.language = language;
        this.data = data;
        this.views = views;
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
    @SerializeNullable
    public String getLanguage() {
        return language;
    }

    @Serialize(order = 5)
    @SerializeNullable
    public String getData() {
        return data;
    }

    @Serialize(order = 6)
    @SerializeNullable
    public Long getViews() {
        return views;
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

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setViews(Long views) {
        this.views = views;
    }
}
