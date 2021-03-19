import os
from shutil import copyfile, SameFileError, copytree, rmtree, move

PATH_FOLDER_RESULTS = 'results/'
PATH_TO_TARGET_JJOULES_REPORTS = 'target/jjoules-reports/'

def run_command(command):
    print(command)
    return os.system(command)

def clean_compile():
    run_command(
        'mvn -Drat.skip=true -Djacoco.skip=true -Danimal.sniffer.skip=true clean test -DskipTests'
    )

def run_test(test_classes):
    run_command(
        'mvn -Drat.skip=true -Djacoco.skip=true -Danimal.sniffer.skip=true test -Dtest=' + 
        ','.join([
            test_classes[0],# + "#" + test_methods[0],
            test_classes[1]# + "#" + test_methods[1],
        ])
    )

def copy_jjoules_reports_for_iteration(iteration):
    try:
        copytree(PATH_TO_TARGET_JJOULES_REPORTS, PATH_FOLDER_RESULTS + str(iteration) + '/')
    except (SameFileError):
       print('error while copying jjoules reports folder')

def delete_directory(directory):
    if os.path.isdir(directory):
        rmtree(directory)

def mkdir(path):
    try:
        os.makedirs(path)
    except FileExistsError:
        print('pass...')

def copy_and_delete_jjoules_reports_for_iteration(iteration):
    copy_jjoules_reports_for_iteration(iteration)
    delete_directory(PATH_TO_TARGET_JJOULES_REPORTS)

NB_ITERATION = 3
test_classes = ['org.apache.commons.lang3.AmplEnergyArraySorterTest', 'org.apache.commons.lang3.ArraySorterTest']

#test_methods = [
#    'warmup0+warmup1+warmup2+warmup3+warmup4+warmup5+warmup6+warmup7+warmup8+warmup9+testSortByteArray+testSortByteArray_literalMutationNumber28+testSortByteArray_literalMutationNumber29+testSortByteArray_literalMutationNumber30+testSortByteArray_literalMutationNumber31+testSortByteArray_literalMutationNumber32+testSortByteArray_literalMutationNumber33+testSortByteArray_literalMutationNumber34+testSortByteArray_literalMutationNumber35+testSortByteArray_literalMutationNumber36+testSortCharArray+testSortCharArray_literalMutationNumber64+testSortCharArray_literalMutationNumber65+testSortCharArray_literalMutationNumber66+testSortCharArray_literalMutationNumber67+testSortCharArray_literalMutationNumber68+testSortCharArray_literalMutationNumber69+testSortCharArray_literalMutationNumber70+testSortCharArray_literalMutationNumber71+testSortCharArray_literalMutationNumber72+testSortComparable+testSortComparable_literalMutationString100+testSortComparable_literalMutationString101+testSortComparable_literalMutationString102+testSortComparable_literalMutationString103+testSortComparable_literalMutationString104+testSortComparable_literalMutationString105+testSortComparable_literalMutationString106+testSortComparable_literalMutationString107+testSortComparable_literalMutationString108+testSortComparable_literalMutationString109+testSortComparable_literalMutationString110+testSortComparable_literalMutationString111+testSortDoubleArray+testSortFloatArray+testSortFloatArray_literalMutationNumber184+testSortFloatArray_literalMutationNumber185+testSortFloatArray_literalMutationNumber186+testSortFloatArray_literalMutationNumber187+testSortFloatArray_literalMutationNumber188+testSortFloatArray_literalMutationNumber189+testSortFloatArray_literalMutationNumber190+testSortFloatArray_literalMutationNumber191+testSortFloatArray_literalMutationNumber192+testSortIntArray+testSortIntArray_literalMutationNumber220+testSortIntArray_literalMutationNumber221+testSortIntArray_literalMutationNumber222+testSortIntArray_literalMutationNumber223+testSortIntArray_literalMutationNumber224+testSortIntArray_literalMutationNumber225+testSortIntArray_literalMutationNumber226+testSortIntArray_literalMutationNumber227+testSortIntArray_literalMutationNumber228+testSortLongArray+testSortLongArray_literalMutationNumber256+testSortLongArray_literalMutationNumber257+testSortLongArray_literalMutationNumber258+testSortLongArray_literalMutationNumber259+testSortLongArray_literalMutationNumber260+testSortLongArray_literalMutationNumber261+testSortLongArray_literalMutationNumber262+testSortLongArray_literalMutationNumber263+testSortLongArray_literalMutationNumber264+testSortObjects+testSortObjects_literalMutationString292+testSortObjects_literalMutationString293+testSortObjects_literalMutationString294+testSortObjects_literalMutationString295+testSortObjects_literalMutationString296+testSortObjects_literalMutationString297+testSortObjects_literalMutationString298+testSortObjects_literalMutationString299+testSortObjects_literalMutationString300+testSortObjects_literalMutationString301+testSortObjects_literalMutationString302+testSortObjects_literalMutationString303+testSortShortArray+testSortShortArray_literalMutationNumber340+testSortShortArray_literalMutationNumber341+testSortShortArray_literalMutationNumber342+testSortShortArray_literalMutationNumber343+testSortShortArray_literalMutationNumber344+testSortShortArray_literalMutationNumber345+testSortShortArray_literalMutationNumber346+testSortShortArray_literalMutationNumber347+testSortShortArray_literalMutationNumber348',
#    'warmup0+warmup1+warmup2+warmup3+warmup4+warmup5+warmup6+warmup7+warmup8+warmup9+testSortByteArray+testSortCharArray+testSortComparable+testSortDoubleArray+testSortFloatArray+testSortIntArray+testSortLongArray+testSortObjects+testSortShortArray'
#]

if __name__ == '__main__':

    clean_compile()
    mkdir(PATH_FOLDER_RESULTS)
    
    for i in range(0, NB_ITERATION):
        run_test(test_classes)
        copy_and_delete_jjoules_reports_for_iteration(i)