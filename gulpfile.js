const { src, dest, series } = require('gulp');
const clean = require('gulp-clean');
const htmlmin = require('gulp-htmlmin');

function cleanDist() {
  return src('dist', { allowEmpty: true, read: false })
    .pipe(clean());
}

function buildHtml() {
  return src('web/**/*.html')
    .pipe(htmlmin({ collapseWhitespace: true, removeComments: true, minifyCSS: true, minifyJS: true }))
    .pipe(dest('dist'));
}

exports.clean = cleanDist;
exports.build = series(cleanDist, buildHtml);
exports.default = exports.build;
