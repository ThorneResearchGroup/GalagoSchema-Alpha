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
import tech.tresearchgroup.schemas.galago.enums.ShowStatusEnum;
import tech.tresearchgroup.schemas.galago.enums.TvShowGenreEnum;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
public class TvShowEntity implements BasicObjectInterface {
    private transient Date created;

    private transient Date updated;

    private Long id;

    private String title;

    private String description;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "files") FileEntity> files;

    private ShowStatusEnum showStatus;

    private String firstAired;

    private String airsOn;

    @JsonAdapter(IntIgnoreZeroAdapter.class)
    private int runtime;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "genres") TvShowGenreEnum> genres;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "filmLocations") LocationEntity> filmLocations;

    private String languages;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "seasons") SeasonEntity> seasons;

    private VideoEntity trailer;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "otherVideos") VideoEntity> otherVideos;

    private ImageEntity primaryImage;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "otherImages") ImageEntity> otherImages;

    private Long views;

    public TvShowEntity(@Deserialize("created") Date created,
                        @Deserialize("updated") Date updated,
                        @Deserialize("id") Long id,
                        @Deserialize("title") String title,
                        @Deserialize("description") String description,
                        @Deserialize("files") List<FileEntity> files,
                        @Deserialize("showStatus") ShowStatusEnum showStatus,
                        @Deserialize("firstAired") String firstAired,
                        @Deserialize("airsOn") String airsOn,
                        @Deserialize("runtime") int runtime,
                        @Deserialize("genres") List<TvShowGenreEnum> genres,
                        @Deserialize("filmLocations") List<LocationEntity> filmLocations,
                        @Deserialize("languages") String languages,
                        @Deserialize("seasons") List<SeasonEntity> seasons,
                        @Deserialize("trailer") VideoEntity trailer,
                        @Deserialize("otherVideos") List<VideoEntity> otherVideos,
                        @Deserialize("primaryImage") ImageEntity primaryImage,
                        @Deserialize("otherImages") List<ImageEntity> otherImages,
                        @Deserialize("views") Long views) {
        this.created = created;
        this.updated = updated;
        this.id = id;
        this.title = title;
        this.description = description;
        this.files = files;
        this.showStatus = showStatus;
        this.firstAired = firstAired;
        this.airsOn = airsOn;
        this.runtime = runtime;
        this.genres = genres;
        this.filmLocations = filmLocations;
        this.languages = languages;
        this.seasons = seasons;
        this.trailer = trailer;
        this.otherVideos = otherVideos;
        this.primaryImage = primaryImage;
        this.otherImages = otherImages;
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
    public String getDescription() {
        return description;
    }

    @Serialize(order = 5)
    public List<FileEntity> getFiles() {
        return files;
    }

    @Serialize(order = 6)
    @SerializeNullable
    public ShowStatusEnum getShowStatus() {
        return showStatus;
    }

    @Serialize(order = 7)
    @SerializeNullable
    public String getFirstAired() {
        return firstAired;
    }

    @Serialize(order = 8)
    @SerializeNullable
    public String getAirsOn() {
        return airsOn;
    }

    @Serialize(order = 9)
    public int getRuntime() {
        return runtime;
    }

    @Serialize(order = 10)
    public List<TvShowGenreEnum> getGenres() {
        return genres;
    }

    @Serialize(order = 11)
    public List<LocationEntity> getFilmLocations() {
        return filmLocations;
    }

    @Serialize(order = 12)
    @SerializeNullable
    public String getLanguages() {
        return languages;
    }

    @Serialize(order = 13)
    public List<SeasonEntity> getSeasons() {
        return seasons;
    }

    @Serialize(order = 14)
    public VideoEntity getTrailer() {
        return trailer;
    }

    @Serialize(order = 15)
    public List<VideoEntity> getOtherVideos() {
        return otherVideos;
    }

    @Serialize(order = 16)
    public ImageEntity getPrimaryImage() {
        return primaryImage;
    }

    @Serialize(order = 17)
    public List<ImageEntity> getOtherImages() {
        return otherImages;
    }

    @Serialize(order = 18)
    @SerializeNullable
    public Long getViews() {
        return views;
    }
}
