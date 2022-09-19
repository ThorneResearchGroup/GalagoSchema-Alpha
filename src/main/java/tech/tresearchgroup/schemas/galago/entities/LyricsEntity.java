package tech.tresearchgroup.schemas.galago.entities;

import io.activej.serializer.annotations.Deserialize;
import io.activej.serializer.annotations.Serialize;
import io.activej.serializer.annotations.SerializeNullable;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.tresearchgroup.palila.model.BasicObjectInterface;
import tech.tresearchgroup.schemas.galago.enums.LanguagesEnum;

import java.util.Date;

@Data
@NoArgsConstructor
public class LyricsEntity implements BasicObjectInterface {
    private transient Date created;

    private transient Date updated;

    private Long id;

    private String data;

    private Long views;

    private LanguagesEnum language;

    public LyricsEntity(@Deserialize("created") Date created,
                        @Deserialize("updated") Date updated,
                        @Deserialize("id") Long id,
                        @Deserialize("data") String data,
                        @Deserialize("views") Long views,
                        @Deserialize("language") LanguagesEnum language) {
        this.created = created;
        this.updated = updated;
        this.id = id;
        this.data = data;
        this.views = views;
        this.language = language;
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
    public String getData() {
        return data;
    }

    @Serialize(order = 4)
    @SerializeNullable
    public Long getViews() {
        return views;
    }

    @Serialize(order = 5)
    @SerializeNullable
    public LanguagesEnum getLanguage() {
        return language;
    }
}
