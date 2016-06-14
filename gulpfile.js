var gulp       = require('gulp'),
    streamify  = require('gulp-streamify'),
    babelify   = require('babelify'),
    browserify = require('browserify'),
    source     = require('vinyl-source-stream'),
    uglify     = require('gulp-uglify'),
    sass       = require('gulp-sass');


gulp.task('js',() =>{
  browserify({
    entries: 'gulp/js',
    extensions: ['.js'],
    debug: true
  })
  .transform(babelify, { presets: ['react','es2015'] })
  .bundle()
  .pipe(source('bundle.js'))
  .pipe(gulp.dest('src/main/resources/static/js'));
});

gulp.task('sass',() =>{
  gulp.src('gulp/scss/main.scss')
    .pipe(sass({
      outputStyle: 'compressed'
    }))
    .pipe(gulp.dest('src/main/resources/static/css'));
});

gulp.task('watch',() =>{
  gulp.watch('gulp/js/**/*.*', ['js']);
  gulp.watch('gulp/scss/**/*.*', ['sass']);
});

gulp.task('default', ['js', 'sass', 'watch']);