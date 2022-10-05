package tech.tresearchgroup.schemas.galago.entities;

import com.google.gson.annotations.JsonAdapter;
import io.activej.serializer.annotations.Deserialize;
import io.activej.serializer.annotations.Serialize;
import io.activej.serializer.annotations.SerializeClass;
import io.activej.serializer.annotations.SerializeNullable;
import tech.tresearchgroup.palila.model.BasicFormObject;
import tech.tresearchgroup.palila.model.BasicObjectInterface;
import tech.tresearchgroup.palila.model.LockType;
import tech.tresearchgroup.schemas.galago.IntIgnoreZeroAdapter;
import tech.tresearchgroup.schemas.galago.ListIgnoreEmptyAdapter;
import tech.tresearchgroup.schemas.galago.enums.ShowStatusEnum;
import tech.tresearchgroup.schemas.galago.enums.TvShowGenreEnum;

import java.util.Date;
import java.util.List;

public class TvShowEntity extends BasicFormObject implements BasicObjectInterface {

    private transient Date created;

    private transient Date updated;

    private Long id;

    private LockType lockType;
    private String title;

    private String description;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "files") VideoEntity> files;

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

    public TvShowEntity() {
    }

    public TvShowEntity(@Deserialize("created") Date created,
                        @Deserialize("updated") Date updated,
                        @Deserialize("id") Long id,
                        @Deserialize("lockType") LockType lockType,
                        @Deserialize("title") String title,
                        @Deserialize("description") String description,
                        @Deserialize("files") List<VideoEntity> files,
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
        this.lockType = lockType;
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
    public String getDescription() {
        return description;
    }

    @Serialize(order = 6)
    public List<VideoEntity> getFiles() {
        return files;
    }

    @Serialize(order = 7)
    @SerializeNullable
    public ShowStatusEnum getShowStatus() {
        return showStatus;
    }

    @Serialize(order = 8)
    @SerializeNullable
    public String getFirstAired() {
        return firstAired;
    }

    @Serialize(order = 9)
    @SerializeNullable
    public String getAirsOn() {
        return airsOn;
    }

    @Serialize(order = 10)
    public int getRuntime() {
        return runtime;
    }

    @Serialize(order = 11)
    public List<TvShowGenreEnum> getGenres() {
        return genres;
    }

    @Serialize(order = 12)
    public List<LocationEntity> getFilmLocations() {
        return filmLocations;
    }

    @Serialize(order = 13)
    @SerializeNullable
    public String getLanguages() {
        return languages;
    }

    @Serialize(order = 14)
    public List<SeasonEntity> getSeasons() {
        return seasons;
    }

    @Serialize(order = 15)
    public VideoEntity getTrailer() {
        return trailer;
    }

    @Serialize(order = 16)
    public List<VideoEntity> getOtherVideos() {
        return otherVideos;
    }

    @Serialize(order = 17)
    public ImageEntity getPrimaryImage() {
        return primaryImage;
    }

    @Serialize(order = 18)
    public List<ImageEntity> getOtherImages() {
        return otherImages;
    }

    @Serialize(order = 19)
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

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFiles(List<VideoEntity> files) {
        this.files = files;
    }

    public void setShowStatus(ShowStatusEnum showStatus) {
        this.showStatus = showStatus;
    }

    public void setFirstAired(String firstAired) {
        this.firstAired = firstAired;
    }

    public void setAirsOn(String airsOn) {
        this.airsOn = airsOn;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public void setGenres(List<TvShowGenreEnum> genres) {
        this.genres = genres;
    }

    public void setFilmLocations(List<LocationEntity> filmLocations) {
        this.filmLocations = filmLocations;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public void setSeasons(List<SeasonEntity> seasons) {
        this.seasons = seasons;
    }

    public void setTrailer(VideoEntity trailer) {
        this.trailer = trailer;
    }

    public void setOtherVideos(List<VideoEntity> otherVideos) {
        this.otherVideos = otherVideos;
    }

    public void setPrimaryImage(ImageEntity primaryImage) {
        this.primaryImage = primaryImage;
    }

    public void setOtherImages(List<ImageEntity> otherImages) {
        this.otherImages = otherImages;
    }

    public void setViews(Long views) {
        this.views = views;
    }
}
