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
import tech.tresearchgroup.schemas.galago.enums.*;

import java.util.Date;
import java.util.List;

public class GameEntity extends BasicFormObject implements BasicObjectInterface {
    private transient Date created;

    private transient Date updated;

    private Long id;

    private LockType lockType;
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

    public GameEntity() {
    }

    public GameEntity(@Deserialize("created") Date created,
                      @Deserialize("updated") Date updated,
                      @Deserialize("id") Long id,
                      @Deserialize("lockType") LockType lockType,
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
        this.lockType = lockType;
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
    @SerializeNullable
    public List<FileEntity> getFiles() {
        return files;
    }

    @Serialize(order = 7)
    public ImageEntity getPoster() {
        return poster;
    }

    @Serialize(order = 8)
    @SerializeNullable
    public List<ImageEntity> getOtherImages() {
        return otherImages;
    }

    @Serialize(order = 9)
    public VideoEntity getTrailer() {
        return trailer;
    }

    @Serialize(order = 10)
    @SerializeNullable
    public List<VideoEntity> getOtherVideos() {
        return otherVideos;
    }

    @Serialize(order = 11)
    @SerializeNullable
    public List<GameGenreEnum> getGenres() {
        return genres;
    }

    @Serialize(order = 12)
    @SerializeNullable
    public ESRBRatingEnum getEsrbRating() {
        return esrbRating;
    }

    @Serialize(order = 13)
    @SerializeNullable
    public List<GameContentWarningEnum> getContentWarnings() {
        return contentWarnings;
    }

    @Serialize(order = 14)
    @SerializeNullable
    public List<GamePlatformEnum> getPlatforms() {
        return platforms;
    }

    @Serialize(order = 15)
    @SerializeNullable
    public List<CompanyEntity> getDevelopers() {
        return developers;
    }

    @Serialize(order = 16)
    @SerializeNullable
    public List<CompanyEntity> getPublishers() {
        return publishers;
    }

    @Serialize(order = 17)
    @SerializeNullable
    public List<GameModeEnum> getGameModes() {
        return gameModes;
    }

    @Serialize(order = 18)
    @SerializeNullable
    public GameSeriesEntity getGameSeries() {
        return gameSeries;
    }

    @Serialize(order = 19)
    public GameEngineEntity getGameEngine() {
        return gameEngine;
    }

    @Serialize(order = 20)
    @SerializeNullable
    public List<GamePlayerPerspectiveEnum> getGamePlayerPerspective() {
        return gamePlayerPerspective;
    }

    @Serialize(order = 21)
    public int getGameUserRating() {
        return gameUserRating;
    }

    @Serialize(order = 22)
    public boolean isInAppPurchases() {
        return inAppPurchases;
    }

    @Serialize(order = 23)
    public boolean isMicroTransactions() {
        return microTransactions;
    }

    @Serialize(order = 24)
    public int getExpectedCompletionTime() {
        return expectedCompletionTime;
    }

    @Serialize(order = 25)
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

    public void setFiles(List<FileEntity> files) {
        this.files = files;
    }

    public void setPoster(ImageEntity poster) {
        this.poster = poster;
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

    public void setGenres(List<GameGenreEnum> genres) {
        this.genres = genres;
    }

    public void setEsrbRating(ESRBRatingEnum esrbRating) {
        this.esrbRating = esrbRating;
    }

    public void setContentWarnings(List<GameContentWarningEnum> contentWarnings) {
        this.contentWarnings = contentWarnings;
    }

    public void setPlatforms(List<GamePlatformEnum> platforms) {
        this.platforms = platforms;
    }

    public void setDevelopers(List<CompanyEntity> developers) {
        this.developers = developers;
    }

    public void setPublishers(List<CompanyEntity> publishers) {
        this.publishers = publishers;
    }

    public void setGameModes(List<GameModeEnum> gameModes) {
        this.gameModes = gameModes;
    }

    public void setGameSeries(GameSeriesEntity gameSeries) {
        this.gameSeries = gameSeries;
    }

    public void setGameEngine(GameEngineEntity gameEngine) {
        this.gameEngine = gameEngine;
    }

    public void setGamePlayerPerspective(List<GamePlayerPerspectiveEnum> gamePlayerPerspective) {
        this.gamePlayerPerspective = gamePlayerPerspective;
    }

    public void setGameUserRating(int gameUserRating) {
        this.gameUserRating = gameUserRating;
    }

    public void setInAppPurchases(boolean inAppPurchases) {
        this.inAppPurchases = inAppPurchases;
    }

    public void setMicroTransactions(boolean microTransactions) {
        this.microTransactions = microTransactions;
    }

    public void setExpectedCompletionTime(int expectedCompletionTime) {
        this.expectedCompletionTime = expectedCompletionTime;
    }

    public void setViews(Long views) {
        this.views = views;
    }
}
