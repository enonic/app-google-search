const GoogleAuth = __.newBean('com.enonic.app.googlesearch.GoogleAuth');

exports.get = function (req) {
    const token = __.toNativeObject(GoogleAuth.getToken());
    return {
        status: token ? 200 : 404,
        body: token,
        contentType: 'application/json'
    };
};
