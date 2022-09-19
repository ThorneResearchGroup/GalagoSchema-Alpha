package tech.tresearchgroup.schemas.galago.entities;

import com.google.gson.annotations.JsonAdapter;
import io.activej.serializer.annotations.Deserialize;
import io.activej.serializer.annotations.Serialize;
import io.activej.serializer.annotations.SerializeNullable;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.tresearchgroup.palila.model.BasicObjectInterface;
import tech.tresearchgroup.schemas.galago.LongIgnoreZeroAdapter;

import java.util.Date;

@Data
@NoArgsConstructor
public class FileEntity implements BasicObjectInterface {
    private transient Date created;

    private transient Date updated;

    private Long id;
    @JsonAdapter(LongIgnoreZeroAdapter.class)
    private Long views;

    private String path;

    public FileEntity(@Deserialize("created") Date created,
                      @Deserialize("updated") Date updated,
                      @Deserialize("id") Long id,
                      @Deserialize("views") Long views,
                      @Deserialize("path") String path) {
        this.created = created;
        this.updated = updated;
        this.id = id;
        this.views = views;
        this.path = path;
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
    public Long getViews() {
        return views;
    }

    @Serialize(order = 4)
    @SerializeNullable
    public String getPath() {
        return path;
    }
}
