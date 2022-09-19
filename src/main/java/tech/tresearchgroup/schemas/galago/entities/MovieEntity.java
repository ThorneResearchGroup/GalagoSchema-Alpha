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
import tech.tresearchgroup.schemas.galago.LongIgnoreZeroAdapter;
import tech.tresearchgroup.schemas.galago.enums.CountryEnum;
import tech.tresearchgroup.schemas.galago.enums.MPAARatingEnum;
import tech.tresearchgroup.schemas.galago.enums.MovieGenreEnum;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
public class MovieEntity implements BasicObjectInterface {
    private transient Date created;

    private transient Date updated;

    private Long id;

    private String title;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<FileEntity> files;

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

    public MovieEntity(@Deserialize("created") Date created,
                       @Deserialize("updated") Date updated,
                       @Deserialize("id") Long id,
                       @Deserialize("title") String title,
                       @Deserialize("files") List<FileEntity> files,
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
    public String getTitle() {
        return title;
    }

    @Serialize(order = 4)
    @SerializeNullable
    public List<@SerializeClass(subclassesId = "files") FileEntity> getFiles() {
        return files;
    }

    @Serialize(order = 5)
    @SerializeNullable
    public ImageEntity getPrimaryImage() {
        return primaryImage;
    }

    @Serialize(order = 6)
    @SerializeNullable
    public List<ImageEntity> getOtherImages() {
        return otherImages;
    }

    @Serialize(order = 7)
    @SerializeNullable
    public VideoEntity getTrailer() {
        return trailer;
    }

    @Serialize(order = 8)
    @SerializeNullable
    public List<VideoEntity> getOtherVideos() {
        return otherVideos;
    }

    @Serialize(order = 9)
    @SerializeNullable
    public List<SubtitleEntity> getSubtitles() {
        return subtitles;
    }

    @Serialize(order = 10)
    @SerializeNullable
    public String getReleaseDate() {
        return releaseDate;
    }

    @Serialize(order = 11)
    public int getRuntime() {
        return runtime;
    }

    @Serialize(order = 12)
    @SerializeNullable
    public MPAARatingEnum getMpaaRating() {
        return mpaaRating;
    }

    @Serialize(order = 13)
    public int getUserRating() {
        return userRating;
    }

    @Serialize(order = 14)
    @SerializeNullable
    public MovieGenreEnum getGenre() {
        return genre;
    }

    @Serialize(order = 15)
    @SerializeNullable
    public List<PersonEntity> getDirectors() {
        return directors;
    }

    @Serialize(order = 16)
    @SerializeNullable
    public List<PersonEntity> getWriters() {
        return writers;
    }

    @Serialize(order = 17)
    @SerializeNullable
    public List<PersonEntity> getCast() {
        return cast;
    }

    @Serialize(order = 18)
    @SerializeNullable
    public List<CompanyEntity> getProductionCompany() {
        return productionCompany;
    }

    @Serialize(order = 19)
    @SerializeNullable
    public String getStoryLine() {
        return storyLine;
    }

    @Serialize(order = 20)
    @SerializeNullable
    public String getLanguages() {
        return languages;
    }

    @Serialize(order = 21)
    public int getBudget() {
        return budget;
    }

    @Serialize(order = 22)
    public int getAmericasGross() {
        return americasGross;
    }

    @Serialize(order = 23)
    public int getWorldWideGross() {
        return worldWideGross;
    }

    @Serialize(order = 24)
    public int getAmericasOpeningWeekend() {
        return americasOpeningWeekend;
    }

    @Serialize(order = 25)
    @SerializeNullable
    public String getAspectRatio() {
        return aspectRatio;
    }

    @Serialize(order = 26)
    @SerializeNullable
    public CountryEnum getCountryOfOrigin() {
        return countryOfOrigin;
    }

    @Serialize(order = 27)
    @SerializeNullable
    public Long getViews() {
        return views;
    }
}
