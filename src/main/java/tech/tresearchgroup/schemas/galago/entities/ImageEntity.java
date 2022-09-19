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
public class ImageEntity implements BasicObjectInterface {
    private transient Date created;

    private transient Date updated;

    private Long id;

    private String title;

    private FileEntity file;

    private String description;

    private Long views;

    public ImageEntity(@Deserialize("created") Date created,
                       @Deserialize("updated") Date updated,
                       @Deserialize("id") Long id,
                       @Deserialize("title") String title,
                       @Deserialize("file") FileEntity file,
                       @Deserialize("description") String description,
                       @Deserialize("views") Long views) {
        this.created = created;
        this.updated = updated;
        this.id = id;
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
    public String getTitle() {
        return title;
    }

    @Serialize(order = 4)
    @SerializeNullable
    public FileEntity getFile() {
        return file;
    }

    @Serialize(order = 5)
    @SerializeNullable
    public String getDescription() {
        return description;
    }

    @Serialize(order = 6)
    @SerializeNullable
    public Long getViews() {
        return views;
    }
}
