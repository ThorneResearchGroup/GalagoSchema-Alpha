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
import tech.tresearchgroup.schemas.galago.LongIgnoreZeroAdapter;
import tech.tresearchgroup.schemas.galago.enums.CountryEnum;
import tech.tresearchgroup.schemas.galago.enums.MPAARatingEnum;
import tech.tresearchgroup.schemas.galago.enums.MovieGenreEnum;

import java.util.Date;
import java.util.List;

public class MovieEntity extends BasicFormObject implements BasicObjectInterface {
    private transient Date created;

    private transient Date updated;

    private Long id;

    private LockType lockType;

    private String title;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<VideoEntity> files;

    private ImageEntity primaryImage;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "otherImages") ImageEntity> otherImages;

    private VideoEntity trailer;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "otherVideos") VideoEntity> otherVideos;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "subtitles") SubtitleEntity> subtitles;

    private String releaseDate;

    @JsonAdapter(IntIgnoreZeroAdapter.class)
    private int runtime;

    private MPAARatingEnum mpaaRating;

    @JsonAdapter(IntIgnoreZeroAdapter.class)
    private int userRating;

    private MovieGenreEnum genre;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "directors") PersonEntity> directors;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "writers") PersonEntity> writers;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "cast") PersonEntity> cast;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "productionCompany") CompanyEntity> productionCompany;

    private String storyLine;

    private String languages;

    @JsonAdapter(IntIgnoreZeroAdapter.class)
    private int budget;

    @JsonAdapter(IntIgnoreZeroAdapter.class)
    private int americasGross;

    @JsonAdapter(IntIgnoreZeroAdapter.class)
    private int worldWideGross;

    @JsonAdapter(IntIgnoreZeroAdapter.class)
    private int americasOpeningWeekend;

    private String aspectRatio;

    private CountryEnum countryOfOrigin;

    @JsonAdapter(LongIgnoreZeroAdapter.class)
    private Long views;

    public MovieEntity() {
    }

    public MovieEntity(@Deserialize("created") Date created,
                       @Deserialize("updated") Date updated,
                       @Deserialize("id") Long id,
                       @Deserialize("lockType") LockType lockType,
                       @Deserialize("title") String title,
                       @Deserialize("files") List<VideoEntity> files,
                       @Deserialize("primaryImage") ImageEntity primaryImage,
                       @Deserialize("otherImages") List<ImageEntity> otherImages,
                       @Deserialize("trailer") VideoEntity trailer,
                       @Deserialize("otherVideos") List<VideoEntity> otherVideos,
                       @Deserialize("subtitles") List<SubtitleEntity> subtitles,
                       @Deserialize("releaseDate") String releaseDate,
                       @Deserialize("runtime") int runtime,
                       @Deserialize("mpaaRating") MPAARatingEnum mpaaRating,
                       @Deserialize("userRating") int userRating,
                       @Deserialize("genre") MovieGenreEnum genre,
                       @Deserialize("directors") List<PersonEntity> directors,
                       @Deserialize("writers") List<PersonEntity> writers,
                       @Deserialize("cast") List<PersonEntity> cast,
                       @Deserialize("productionCompany") List<CompanyEntity> productionCompany,
                       @Deserialize("storyLine") String storyLine,
                       @Deserialize("languages") String languages,
                       @Deserialize("budget") int budget,
                       @Deserialize("americasGross") int americasGross,
                       @Deserialize("worldWideGross") int worldWideGross,
                       @Deserialize("americasOpeningWeekend") int americasOpeningWeekend,
                       @Deserialize("aspectRatio") String aspectRatio,
                       @Deserialize("countryOfOrigin") CountryEnum countryOfOrigin,
                       @Deserialize("views") Long views) {
        this.created = created;
        this.updated = updated;
        this.id = id;
        this.lockType = lockType;
        this.title = title;
        this.files = files;
        this.primaryImage = primaryImage;
        this.otherImages = otherImages;
        this.trailer = trailer;
        this.otherVideos = otherVideos;
        this.subtitles = subtitles;
        this.releaseDate = releaseDate;
        this.runtime = runtime;
        this.mpaaRating = mpaaRating;
        this.userRating = userRating;
        this.genre = genre;
        this.directors = directors;
        this.writers = writers;
        this.cast = cast;
        this.productionCompany = productionCompany;
        this.storyLine = storyLine;
        this.languages = languages;
        this.budget = budget;
        this.americasGross = americasGross;
        this.worldWideGross = worldWideGross;
        this.americasOpeningWeekend = americasOpeningWeekend;
        this.aspectRatio = aspectRatio;
        this.countryOfOrigin = countryOfOrigin;
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
    public List<@SerializeClass(subclassesId = "files") VideoEntity> getFiles() {
        return files;
    }

    @Serialize(order = 6)
    @SerializeNullable
    public ImageEntity getPrimaryImage() {
        return primaryImage;
    }

    @Serialize(order = 7)
    @SerializeNullable
    public List<ImageEntity> getOtherImages() {
        return otherImages;
    }

    @Serialize(order = 8)
    @SerializeNullable
    public VideoEntity getTrailer() {
        return trailer;
    }

    @Serialize(order = 9)
    @SerializeNullable
    public List<VideoEntity> getOtherVideos() {
        return otherVideos;
    }

    @Serialize(order = 10)
    @SerializeNullable
    public List<SubtitleEntity> getSubtitles() {
        return subtitles;
    }

    @Serialize(order = 11)
    @SerializeNullable
    public String getReleaseDate() {
        return releaseDate;
    }

    @Serialize(order = 12)
    public int getRuntime() {
        return runtime;
    }

    @Serialize(order = 13)
    @SerializeNullable
    public MPAARatingEnum getMpaaRating() {
        return mpaaRating;
    }

    @Serialize(order = 14)
    public int getUserRating() {
        return userRating;
    }

    @Serialize(order = 15)
    @SerializeNullable
    public MovieGenreEnum getGenre() {
        return genre;
    }

    @Serialize(order = 16)
    @SerializeNullable
    public List<PersonEntity> getDirectors() {
        return directors;
    }

    @Serialize(order = 17)
    @SerializeNullable
    public List<PersonEntity> getWriters() {
        return writers;
    }

    @Serialize(order = 18)
    @SerializeNullable
    public List<PersonEntity> getCast() {
        return cast;
    }

    @Serialize(order = 19)
    @SerializeNullable
    public List<CompanyEntity> getProductionCompany() {
        return productionCompany;
    }

    @Serialize(order = 20)
    @SerializeNullable
    public String getStoryLine() {
        return storyLine;
    }

    @Serialize(order = 21)
    @SerializeNullable
    public String getLanguages() {
        return languages;
    }

    @Serialize(order = 22)
    public int getBudget() {
        return budget;
    }

    @Serialize(order = 23)
    public int getAmericasGross() {
        return americasGross;
    }

    @Serialize(order = 24)
    public int getWorldWideGross() {
        return worldWideGross;
    }

    @Serialize(order = 25)
    public int getAmericasOpeningWeekend() {
        return americasOpeningWeekend;
    }

    @Serialize(order = 26)
    @SerializeNullable
    public String getAspectRatio() {
        return aspectRatio;
    }

    @Serialize(order = 27)
    @SerializeNullable
    public CountryEnum getCountryOfOrigin() {
        return countryOfOrigin;
    }

    @Serialize(order = 28)
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

    public void setFiles(List<VideoEntity> files) {
        this.files = files;
    }

    public void setPrimaryImage(ImageEntity primaryImage) {
        this.primaryImage = primaryImage;
    }

    public void setOtherImages(List<ImageEntity> otherImages) {
        this.otherImages = otherImages;
    }

    public void setTrailer(VideoEntity trailer) {
        this.trailer = trailer;
    }

    public void setOtherVideos(List<VideoEntity> otherVideos) {
        this.otherVideos = otherVideos;
    }

    public void setSubtitles(List<SubtitleEntity> subtitles) {
        this.subtitles = subtitles;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public void setMpaaRating(MPAARatingEnum mpaaRating) {
        this.mpaaRating = mpaaRating;
    }

    public void setUserRating(int userRating) {
        this.userRating = userRating;
    }

    public void setGenre(MovieGenreEnum genre) {
        this.genre = genre;
    }

    public void setDirectors(List<PersonEntity> directors) {
        this.directors = directors;
    }

    public void setWriters(List<PersonEntity> writers) {
        this.writers = writers;
    }

    public void setCast(List<PersonEntity> cast) {
        this.cast = cast;
    }

    public void setProductionCompany(List<CompanyEntity> productionCompany) {
        this.productionCompany = productionCompany;
    }

    public void setStoryLine(String storyLine) {
        this.storyLine = storyLine;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public void setAmericasGross(int americasGross) {
        this.americasGross = americasGross;
    }

    public void setWorldWideGross(int worldWideGross) {
        this.worldWideGross = worldWideGross;
    }

    public void setAmericasOpeningWeekend(int americasOpeningWeekend) {
        this.americasOpeningWeekend = americasOpeningWeekend;
    }

    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public void setCountryOfOrigin(CountryEnum countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public void setViews(Long views) {
        this.views = views;
    }
}
