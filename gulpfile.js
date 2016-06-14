var gulp = require('gulp'),
    sass = require('gulp-sass');

gulp.task('sass',() =>{
  gulp.src('gulp/scss/main.scss')
      .pipe(sass({
        outputStyle: 'compressed'
      }))
      .pipe(gulp.dest('./src/main/resources/static/css'));
});

gulp.task('watch',() =>{
  gulp.watch('gulp/scss/**/*.scss', ['sass']);
});

gulp.task('default', ['sass', 'watch']);