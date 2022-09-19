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
import tech.tresearchgroup.schemas.galago.enums.*;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
public class GameEntity implements BasicObjectInterface {
    private transient Date created;

    private transient Date updated;

    private Long id;

    private String title;

    private String description;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "files") FileEntity> files;

    private ImageEntity poster;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "otherImages") ImageEntity> otherImages;

    private VideoEntity trailer;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "otherVideos") VideoEntity> otherVideos;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "genres") GameGenreEnum> genres;

    private ESRBRatingEnum esrbRating;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "contentWarnings") GameContentWarningEnum> contentWarnings;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "platforms") GamePlatformEnum> platforms;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "developers") CompanyEntity> developers;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "publishers") CompanyEntity> publishers;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "gameModes") GameModeEnum> gameModes;

    private GameSeriesEntity gameSeries;

    private GameEngineEntity gameEngine;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "gamePlayerPerspective") GamePlayerPerspectiveEnum> gamePlayerPerspective;

    @JsonAdapter(IntIgnoreZeroAdapter.class)
    private int gameUserRating;

    private boolean inAppPurchases;

    private boolean microTransactions;

    @JsonAdapter(IntIgnoreZeroAdapter.class)
    private int expectedCompletionTime;

    private Long views;

    public GameEntity(@Deserialize("created") Date created,
                      @Deserialize("updated") Date updated,
                      @Deserialize("id") Long id,
                      @Deserialize("title") String title,
                      @Deserialize("description") String description,
                      @Deserialize("files") List<FileEntity> files,
                      @Deserialize("poster") ImageEntity poster,
                      @Deserialize("otherImages") List<ImageEntity> otherImages,
                      @Deserialize("trailer") VideoEntity trailer,
                      @Deserialize("otherVideos") List<VideoEntity> otherVideos,
                      @Deserialize("genres") List<GameGenreEnum> genres,
                      @Deserialize("esrbRating") ESRBRatingEnum esrbRating,
                      @Deserialize("contentWarnings") List<GameContentWarningEnum> contentWarnings,
                      @Deserialize("platforms") List<GamePlatformEnum> platformIds,
                      @Deserialize("developers") List<CompanyEntity> developers,
                      @Deserialize("publishers") List<CompanyEntity> publishers,
                      @Deserialize("gameModes") List<GameModeEnum> gameModes,
                      @Deserialize("gameSeries") GameSeriesEntity gameSeries,
                      @Deserialize("gameEngine") GameEngineEntity gameEngine,
                      @Deserialize("gamePlayerPerspective") List<GamePlayerPerspectiveEnum> gamePlayerPerspective,
                      @Deserialize("gameUserRating") int gameUserRating,
                      @Deserialize("inAppPurchases") boolean inAppPurchases,
                      @Deserialize("microTransactions") boolean microTransactions,
                      @Deserialize("expectedCompletionTime") int expectedCompletionTime,
                      @Deserialize("views") Long views) {
        this.created = created;
        this.updated = updated;
        this.id = id;
        this.title = title;
        this.description = description;
        this.files = files;
        this.poster = poster;
        this.otherImages = otherImages;
        this.trailer = trailer;
        this.otherVideos = otherVideos;
        this.genres = genres;
        this.esrbRating = esrbRating;
        this.contentWarnings = contentWarnings;
        this.platforms = platformIds;
        this.developers = developers;
        this.publishers = publishers;
        this.gameModes = gameModes;
        this.gameSeries = gameSeries;
        this.gameEngine = gameEngine;
        this.gamePlayerPerspective = gamePlayerPerspective;
        this.gameUserRating = gameUserRating;
        this.inAppPurchases = inAppPurchases;
        this.microTransactions = microTransactions;
        this.expectedCompletionTime = expectedCompletionTime;
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
    @SerializeNullable
    public List<FileEntity> getFiles() {
        return files;
    }

    @Serialize(order = 6)
    public ImageEntity getPoster() {
        return poster;
    }

    @Serialize(order = 7)
    @SerializeNullable
    public List<ImageEntity> getOtherImages() {
        return otherImages;
    }

    @Serialize(order = 8)
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
    public List<GameGenreEnum> getGenres() {
        return genres;
    }

    @Serialize(order = 11)
    @SerializeNullable
    public ESRBRatingEnum getEsrbRating() {
        return esrbRating;
    }

    @Serialize(order = 12)
    @SerializeNullable
    public List<GameContentWarningEnum> getContentWarnings() {
        return contentWarnings;
    }

    @Serialize(order = 13)
    @SerializeNullable
    public List<GamePlatformEnum> getPlatforms() {
        return platforms;
    }

    @Serialize(order = 14)
    @SerializeNullable
    public List<CompanyEntity> getDevelopers() {
        return developers;
    }

    @Serialize(order = 15)
    @SerializeNullable
    public List<CompanyEntity> getPublishers() {
        return publishers;
    }

    @Serialize(order = 16)
    @SerializeNullable
    public List<GameModeEnum> getGameModes() {
        return gameModes;
    }

    @Serialize(order = 17)
    @SerializeNullable
    public GameSeriesEntity getGameSeries() {
        return gameSeries;
    }

    @Serialize(order = 18)
    public GameEngineEntity getGameEngine() {
        return gameEngine;
    }

    @Serialize(order = 19)
    @SerializeNullable
    public List<GamePlayerPerspectiveEnum> getGamePlayerPerspective() {
        return gamePlayerPerspective;
    }

    @Serialize(order = 20)
    public int getGameUserRating() {
        return gameUserRating;
    }

    @Serialize(order = 21)
    public boolean isInAppPurchases() {
        return inAppPurchases;
    }

    @Serialize(order = 22)
    public boolean isMicroTransactions() {
        return microTransactions;
    }

    @Serialize(order = 23)
    public int getExpectedCompletionTime() {
        return expectedCompletionTime;
    }

    @Serialize(order = 24)
    public Long getViews() {
        return views;
    }
}
