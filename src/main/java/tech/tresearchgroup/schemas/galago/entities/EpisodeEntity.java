package tech.tresearchgroup.schemas.galago.entities;

import com.google.gson.annotations.JsonAdapter;
import io.activej.serializer.annotations.Deserialize;
import io.activej.serializer.annotations.Serialize;
import io.activej.serializer.annotations.SerializeClass;
import io.activej.serializer.annotations.SerializeNullable;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.tresearchgroup.palila.model.BasicObjectInterface;
import tech.tresearchgroup.schemas.galago.IntIgnoreZeroAdapter;
import tech.tresearchgroup.schemas.galago.ListIgnoreEmptyAdapter;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
public class EpisodeEntity implements BasicObjectInterface {
    private transient Date created;

    private transient Date updated;

    private Long id;

    private String title;

    private String description;

    private ImageEntity poster;

    private String firstAired;

    @JsonAdapter(IntIgnoreZeroAdapter.class)
    private Long runtime;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "filmLocations") LocationEntity> filmLocations;

    private String languages;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "otherImages") ImageEntity> otherImages;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "otherVideos") VideoEntity> otherVideos;

    public EpisodeEntity(@Deserialize("created") Date created,
                         @Deserialize("updated") Date updated,
                         @Deserialize("id") Long id,
                         @Deserialize("title") String title,
                         @Deserialize("description") String description,
                         @Deserialize("poster") ImageEntity poster,
                         @Deserialize("firstAired") String firstAired,
                         @Deserialize("runtime") Long runtime,
                         @Deserialize("filmLocations") List<LocationEntity> filmLocations,
                         @Deserialize("languages") String languages,
                         @Deserialize("otherImages") List<ImageEntity> otherImages,
                         @Deserialize("otherVideos") List<VideoEntity> otherVideos) {
        this.created = created;
        this.updated = updated;
        this.id = id;
        this.title = title;
        this.description = description;
        this.poster = poster;
        this.firstAired = firstAired;
        this.runtime = runtime;
        this.filmLocations = filmLocations;
        this.languages = languages;
        this.otherImages = otherImages;
        this.otherVideos = otherVideos;
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
    public String getDescription() {
        return description;
    }

    @Serialize(order = 5)
    public ImageEntity getPoster() {
        return poster;
    }

    @Serialize(order = 6)
    @SerializeNullable
    public String getFirstAired() {
        return firstAired;
    }

    @Serialize(order = 7)
    @SerializeNullable
    public Long getRuntime() {
        return runtime;
    }

    @Serialize(order = 8)
    public List<LocationEntity> getFilmLocations() {
        return filmLocations;
    }

    @Serialize(order = 9)
    @SerializeNullable
    public String getLanguages() {
        return languages;
    }

    @Serialize(order = 10)
    public List<ImageEntity> getOtherImages() {
        return otherImages;
    }

    @Serialize(order = 11)
    public List<VideoEntity> getOtherVideos() {
        return otherVideos;
    }
}
