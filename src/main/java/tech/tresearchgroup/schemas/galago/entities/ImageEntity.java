package tech.tresearchgroup.schemas.galago.entities;

import io.activej.serializer.annotations.Deserialize;
import io.activej.serializer.annotations.Serialize;
import io.activej.serializer.annotations.SerializeNullable;
import tech.tresearchgroup.palila.model.BasicFormObject;
import tech.tresearchgroup.palila.model.BasicObjectInterface;
import tech.tresearchgroup.palila.model.LockType;

import java.util.Date;

public class ImageEntity extends BasicFormObject implements BasicObjectInterface {

    private transient Date created;

    private transient Date updated;

    private Long id;

    private LockType lockType;
    private String title;

    private FileEntity file;

    private String description;

    private Long views;

    public ImageEntity() {
    }

    public ImageEntity(@Deserialize("created") Date created,
                       @Deserialize("updated") Date updated,
                       @Deserialize("id") Long id,
                       @Deserialize("lockType") LockType lockType,
                       @Deserialize("title") String title,
                       @Deserialize("file") FileEntity file,
                       @Deserialize("description") String description,
                       @Deserialize("views") Long views) {
        this.created = created;
        this.updated = updated;
        this.id = id;
        this.lockType = lockType;
        this.title = title;
        this.file = file;
        this.description = description;
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
    public String getTitle() {
        return title;
    }

    @Serialize(order = 5)
    @SerializeNullable
    public FileEntity getFile() {
        return file;
    }

    @Serialize(order = 6)
    @SerializeNullable
    public String getDescription() {
        return description;
    }

    @Serialize(order = 7)
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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFile(FileEntity file) {
        this.file = file;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setViews(Long views) {
        this.views = views;
    }
}
