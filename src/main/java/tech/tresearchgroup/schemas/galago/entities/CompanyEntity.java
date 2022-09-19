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
public class CompanyEntity implements BasicObjectInterface {
    private transient Date created;

    private transient Date updated;

    private Long id;

    private ImageEntity poster;

    private String name;

    private Long views;

    public CompanyEntity(@Deserialize("created") Date created,
                         @Deserialize("updated") Date updated,
                         @Deserialize("id") Long id,
                         @Deserialize("poster") ImageEntity poster,
                         @Deserialize("name") String name,
                         @Deserialize("views") Long views) {
        this.created = created;
        this.updated = updated;
        this.id = id;
        this.poster = poster;
        this.name = name;
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
    public ImageEntity getPoster() {
        return poster;
    }

    @Serialize(order = 4)
    @SerializeNullable
    public String getName() {
        return name;
    }

    @Serialize(order = 5)
    @SerializeNullable
    public Long getViews() {
        return views;
    }
}
