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
public class SubtitleEntity implements BasicObjectInterface {
    private transient Date created;

    private transient Date updated;

    private Long id;

    private String language;

    private String data;

    private Long views;

    public SubtitleEntity(@Deserialize("created") Date created,
                          @Deserialize("updated") Date updated,
                          @Deserialize("id") Long id,
                          @Deserialize("language") String language,
                          @Deserialize("data") String data,
                          @Deserialize("views") Long views) {
        this.created = created;
        this.updated = updated;
        this.id = id;
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
    public String getLanguage() {
        return language;
    }

    @Serialize(order = 4)
    @SerializeNullable
    public String getData() {
        return data;
    }

    @Serialize(order = 5)
    @SerializeNullable
    public Long getViews() {
        return views;
    }
}
